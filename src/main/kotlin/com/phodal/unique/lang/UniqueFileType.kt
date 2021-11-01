package com.phodal.unique.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon


object UniqueFileType : LanguageFileType(UniqueLanguage) {

    override fun getName(): String = "Unique"

    override fun getIcon(): Icon = UniqueIcons.FILE

    override fun getDefaultExtension(): String = "uql"

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"

    override fun getDescription(): String = "Unique files"
}