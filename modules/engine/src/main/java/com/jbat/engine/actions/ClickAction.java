package com.jbat.engine.actions;

import com.jbat.engine.sdk.OnElementAction;
import com.jbat.engine.sdk.ScriptExecutionContext;
import com.jbat.engine.sdk.SelectorType;
import org.openqa.selenium.WebDriver;

/**
 * @author nidhal.ben-yarou
 */
public class ClickAction extends OnElementAction {

    public ClickAction(String selector, SelectorType selectorType) {
        super(selector, selectorType);
    }

    @Override
    protected String kind() {
        return "click";
    }

    @Override
    protected void execute(WebDriver driver, ScriptExecutionContext context) {
        findElement(driver).click();
    }
}
