package com.jbat.engine.actions;

import com.jbat.engine.sdk.ScriptExecutionContext;
import com.jbat.engine.sdk.Action;
import org.openqa.selenium.WebDriver;

/**
 * @author nidhal.ben-yarou
 */
public class NavaigateAction extends Action {
    private final String url;

    public NavaigateAction(String url) {
        super();
        this.url = url;
    }

    @Override
    protected String kind() {
        return "navigate";
    }

    @Override
    protected void execute(WebDriver driver, ScriptExecutionContext context) {
        driver.get(url);
        metadata.put("before-navigation-url", driver.getCurrentUrl());
        metadata.put("navigation-url", url);
        metadata.put("after-navigation-url", driver.getCurrentUrl());
    }
}
