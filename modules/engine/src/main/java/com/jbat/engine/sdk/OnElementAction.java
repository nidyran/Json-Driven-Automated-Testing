package com.jbat.engine.sdk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author nidhal.ben-yarou
 */
public abstract class OnElementAction extends Action {
    private final String selector;
    private final SelectorType selectorType;

    protected OnElementAction(String selector, SelectorType selectorType) {
        this.selector = selector;
        this.selectorType = selectorType;
    }

    protected WebElement findElement(WebDriver driver) {
        metadata.put("identifier", selector);
        metadata.put("by", selectorType.name());
        WebElement element = selectorType.by(selector).findElement(driver);
        metadata.put("element-tag-name", element.getTagName());
        return element;
    }
}
