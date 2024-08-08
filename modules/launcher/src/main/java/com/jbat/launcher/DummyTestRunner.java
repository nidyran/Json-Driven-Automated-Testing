package com.jbat.launcher;

import com.jbat.engine.actions.ClickAction;
import com.jbat.engine.actions.FillInputAction;
import com.jbat.engine.actions.NavaigateAction;
import com.jbat.engine.sdk.Action;
import com.jbat.engine.sdk.ScriptExecutionContext;
import com.jbat.engine.sdk.SelectorType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author nidhal.ben-yarou
 */
public class DummyTestRunner {

    public DummyTestRunner() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        List<Action> actions = List.of(
                new NavaigateAction("https://www.google.com"),
                new FillInputAction("q", SelectorType.NAME, "Json Driven Automated Testing"),
                new ClickAction("btnK", SelectorType.NAME)
        );
        ScriptExecutionContext context = new ScriptExecutionContext();
        for (Action action : actions) {
            action.run(webDriver, context);
        }
    }
}
