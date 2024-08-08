package com.jbat.engine.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author nidhal.ben-yarou
 */
public class ScriptExecutionContext {
    private final List<ActionExecutionDetails> executionDetails;

    public ScriptExecutionContext() {
        this.executionDetails = new ArrayList<>();
    }


    public void log(ActionExecutionDetails details){
        executionDetails.add(details);
    }

    public record ActionExecutionDetails(String kind, long duration, boolean status, Map<String, Object> metadata){

    }
}
