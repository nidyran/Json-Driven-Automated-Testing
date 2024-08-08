package com.jbat.engine.sdk;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nidhal.ben-yarou
 */
public abstract class Action {
    protected abstract String kind();

    protected final Map<String, Object> metadata;

    protected Action() {
        this.metadata = new HashMap<>();
    }

    protected boolean blocking() {
        return true;
    }

    protected long delay() {
        return 50L;
    }

    public void run(WebDriver driver, ScriptExecutionContext context) throws InterruptedException {
        boolean success = true;
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(delay());
            metadata.put("blocking", blocking());
            metadata.put("delay", delay());
            execute(driver, context);
        } catch (Exception throwable) {
            if(blocking()) {
                throw throwable;
            }
            success = false;
        } finally {
            long duration = System.currentTimeMillis() - start;
            context.log(new ScriptExecutionContext.ActionExecutionDetails(kind(), duration, success, metadata));
        }
    }

    protected abstract void execute(WebDriver driver, ScriptExecutionContext context);
}
