package SampleProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object SampleProject_Build1 : BuildType({
    uuid = "e761486c-85da-43dd-af51-c4a3ff1e948b"
    extId = "SampleProject_Build1"
    name = "Build1"

    vcs {
        root(SampleProject.vcsRoots.SampleProject_HttpsGithubComJuliaAlexandrovaSampleProjectRefsHeadsMaster)

    }

    steps {
        maven {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            goals = "package"
            userSettingsPath = ""
            param("maven.home", "")
        }
    }

    triggers {
        vcs {
        }
    }
})
