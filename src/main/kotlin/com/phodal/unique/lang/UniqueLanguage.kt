package com.phodal.unique.lang

import com.intellij.lang.Language

object UniqueLanguage : Language("Unique", "text/csv", "text/x-csv", "application/csv") {
    override fun isCaseSensitive() = true

    override fun getDisplayName() = "Unique"
}
