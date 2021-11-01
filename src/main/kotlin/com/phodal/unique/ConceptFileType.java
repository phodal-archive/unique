package com.phodal.unique;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ConceptFileType extends LanguageFileType {
    public static final ConceptFileType INSTANCE = new ConceptFileType();

    protected ConceptFileType() {
        super(ConceptLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "Charj File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Charj language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "cj";
    }

    @Override
    public @Nullable Icon getIcon() {
        return ConceptIcons.FILE;
    }
}
