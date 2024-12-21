package com.jdat.selenium.script.executor;

import com.jdat.sdk.adapters.ScriptExecutor;
import com.jdat.sdk.enums.ElementSelectorType;
import com.jdat.sdk.enums.StepAction;
import com.jdat.sdk.models.Script;
import com.jdat.sdk.models.ScriptExecutionContext;
import com.jdat.sdk.models.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

/**
 * @author nidhal.ben-yarou
 */
@Component
public class SeleniumScriptExecutor implements ScriptExecutor {

    @Override
    public void execute(Script script, ScriptExecutionContext context) {
        WebDriver driver = new ChromeDriver();
        for (Step step : script.steps()) {
            switch (step.action()){
                case CLICK -> executeClickAction(driver, step);
                case FILL_INPUT -> executeFillInputAction(driver, step);
                default -> executeNavigateAction(driver, step);
            }
        }
    }

    private void executeNavigateAction(WebDriver driver, Step step) {
        driver.get(step.value());
    }

    private void executeFillInputAction(WebDriver driver, Step step) {
        WebElement element = findElement(step.selectorType(), step.selectorValue(), driver);
        element.sendKeys(step.value());
    }

    private void executeClickAction(WebDriver driver, Step step) {
        WebElement element = findElement(step.selectorType(), step.selectorValue(), driver);
        element.click();
    }

    private WebElement findElement(ElementSelectorType selectorType, String selectorValue, WebDriver driver) {
        switch (selectorType) {
            case ID -> {
                return driver.findElement(By.id(selectorValue));
            }
            case NAME -> {
                return driver.findElement(By.name(selectorValue));
            }
            case CLASS -> {
                return driver.findElement(By.className(selectorValue));
            }
            default -> {
                return driver.findElement(By.xpath(selectorValue));
            }
        }
    }
}
