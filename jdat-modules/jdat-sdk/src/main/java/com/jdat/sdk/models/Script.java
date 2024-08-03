package com.jdat.sdk.models;

import java.util.List;
import java.util.Map;

/**
 * @author nidhal.ben-yarou
 */
public record Script(String name, String description, List<Step> steps, List<String> dependencies, List<String> includes, Map<String, String> variables) {
}
