package com.jbat.engine.actions;

import com.jbat.engine.sdk.ElementSelector;
import com.jbat.engine.sdk.OnElementAction;
import com.jbat.engine.sdk.ScriptExecutionContext;
import com.jbat.engine.sdk.SelectorType;
import org.openqa.selenium.WebDriver;

/**
 * @author nidhal.ben-yarou
 */
public class FillInputAction extends OnElementAction {
    private final String keys;

    public FillInputAction(ElementSelector selector, String keys) {
        super(selector);
        this.keys = keys;
    }

    @Override
    protected String kind() {
        return "fill-input";
    }

    @Override
    protected void execute(WebDriver driver, ScriptExecutionContext context) {
        metadata.put("keys", keys);
        findElement(driver).sendKeys(keys);
    }
}
