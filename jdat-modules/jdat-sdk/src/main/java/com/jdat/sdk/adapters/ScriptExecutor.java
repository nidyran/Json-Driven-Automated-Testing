package com.jdat.sdk.adapters;

import com.jdat.sdk.models.Script;
import com.jdat.sdk.models.ScriptExecutionContext;

/**
 * @author nidhal.ben-yarou
 */
public interface ScriptExecutor {
    void execute(Script script, ScriptExecutionContext context);
}
