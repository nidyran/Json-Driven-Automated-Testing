package com.jdat.sdk.models;

import com.jdat.sdk.enums.ElementSelectorType;
import com.jdat.sdk.enums.StepAction;

/**
 * @author nidhal.ben-yarou
 */
public record Step(String name, String description, StepAction action, ElementSelectorType selectorType, String selectorValue, String value) {
}
