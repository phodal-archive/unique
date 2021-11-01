package com.github.phodal.unique.services

import com.intellij.openapi.project.Project
import com.github.phodal.unique.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
