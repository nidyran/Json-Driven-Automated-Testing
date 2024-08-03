package com.jdat.sdk.models;

import java.util.Map;

/**
 * @author nidhal.ben-yarou
 */
public record ScriptExecutionContext(Map<String, String> variables, String name) {
}
