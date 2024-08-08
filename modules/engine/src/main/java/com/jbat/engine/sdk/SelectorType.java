package com.jbat.engine.sdk;

import org.openqa.selenium.By;

/**
 * @author nidhal.ben-yarou
 */
public enum SelectorType {
    ID,
    NAME,
    CLASS,
    XPATH,
    CSS_SELECTOR;

    public By by(String identifier){
        return switch (this) {
            case ID -> By.id(identifier);
            case NAME -> By.name(identifier);
            case CLASS -> By.className(identifier);
            case XPATH -> By.xpath(identifier);
            case CSS_SELECTOR -> By.cssSelector(identifier);
            default -> throw new IllegalArgumentException("Unsupported identifier type: " + this);
        };
    }
}
