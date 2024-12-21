package com.jdat.sdk.adapters;

import com.jdat.sdk.models.Script;

import java.util.List;

/**
 * @author nidhal.ben-yarou
 */
public interface ScriptsLoader {
    List<Script> load();
}
