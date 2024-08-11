package com.jbat.engine.actions;

import com.jbat.engine.sdk.ElementSelector;
import com.jbat.engine.sdk.OnElementAction;
import com.jbat.engine.sdk.ScriptExecutionContext;
import org.openqa.selenium.WebDriver;

/**
 * @author nidhal.ben-yarou
 */
public class ClickAction extends OnElementAction {

    public ClickAction(ElementSelector selector) {
        super(selector);
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
