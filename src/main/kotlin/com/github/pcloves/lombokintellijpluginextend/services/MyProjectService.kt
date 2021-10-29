package com.github.pcloves.lombokintellijpluginextend.services

import com.intellij.openapi.project.Project
import com.github.pcloves.lombokintellijpluginextend.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
