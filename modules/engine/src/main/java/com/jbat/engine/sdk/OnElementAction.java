package com.jbat.engine.sdk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author nidhal.ben-yarou
 */
public abstract class OnElementAction extends Action {
    private final ElementSelector selector;

    protected OnElementAction(ElementSelector selector) {
        this.selector = selector;
    }

    protected WebElement findElement(WebDriver driver) {
        metadata.put("identifier", selector.value());
        metadata.put("by", selector.type());
        WebElement element = selector.type().by(selector.value()).findElement(driver);
        metadata.put("element-tag-name", element.getTagName());
        return element;
    }
}
