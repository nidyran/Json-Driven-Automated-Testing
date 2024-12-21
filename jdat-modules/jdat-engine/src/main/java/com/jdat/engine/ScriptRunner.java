package com.jdat.engine;

import com.jdat.sdk.adapters.ScriptExecutor;
import com.jdat.sdk.adapters.ScriptsLoader;
import com.jdat.sdk.models.Script;
import com.jdat.sdk.models.ScriptExecutionContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nidhal.ben-yarou
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ScriptRunner {
    private final Map<String, Long> LAST_EXECUTED_PER_SCRIPT = new HashMap<>();
    private final ScriptsLoader scriptsLoader;
    private final ScriptExecutor scriptExecutor;

    @Scheduled(fixedRate = 200)
    public void run() {
        for (Script script : scriptsLoader.load()) {
            if (LAST_EXECUTED_PER_SCRIPT.containsKey(script.name())) {
                long lastExecuted = LAST_EXECUTED_PER_SCRIPT.get(script.name());
                if (System.currentTimeMillis() - lastExecuted < 1000) {
                    continue;
                }
            }
            scriptExecutor.execute(script, new ScriptExecutionContext());
            LAST_EXECUTED_PER_SCRIPT.put(script.name(), System.currentTimeMillis());
        }
    }
}
