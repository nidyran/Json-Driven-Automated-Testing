package com.jdat.scripts.loader;

import com.jdat.sdk.adapters.ScriptsLoader;
import com.jdat.sdk.enums.StepAction;
import com.jdat.sdk.models.Script;
import com.jdat.sdk.models.Step;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nidhal.ben-yarou
 */
@Component
public class DefaultScriptsLoader implements ScriptsLoader {
    @Override
    public List<Script> load() {
        List<Script> scriptList = new ArrayList<>();
        List<Step> stepList = new ArrayList<>();
        stepList.add(new Step("open", "open the browser", StepAction.NAVIGATE, null, null, "https://www.google.com"));
        Script script = new Script("successful-login", "test that the user can login successfully", stepList, null, null, null);
        scriptList.add(script);
        return scriptList;
    }
}
