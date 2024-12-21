package com.jdat.sdk.models;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nidhal.ben-yarou
 */
public record ScriptExecutionContext(Map<String, String> variables, String name) {
    public ScriptExecutionContext(Map<String, String> variables, String name) {
        this.variables = variables;
        this.name = name;
    }

    public ScriptExecutionContext() {
        this(new HashMap<>(), "");
    }
}
