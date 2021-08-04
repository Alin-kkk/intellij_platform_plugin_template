package com.github.alinkk.intellijplatformplugintemplate.services

import com.github.alinkk.intellijplatformplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
