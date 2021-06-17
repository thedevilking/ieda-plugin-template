package com.github.thedevilking.iedaplugintemplate.services

import com.github.thedevilking.iedaplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
