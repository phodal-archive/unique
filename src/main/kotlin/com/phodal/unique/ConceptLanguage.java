package com.phodal.unique;

import com.intellij.lang.Language;

public class ConceptLanguage extends Language {

    public static final ConceptLanguage INSTANCE = new ConceptLanguage();

    public static ConceptLanguage getInstance() {
        return INSTANCE;
    }

    public ConceptLanguage() {
        super("Concept");
    }

}
