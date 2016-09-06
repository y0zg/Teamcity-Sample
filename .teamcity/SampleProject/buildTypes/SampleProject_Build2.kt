package SampleProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object SampleProject_Build2 : BuildType({
    uuid = "newBuildType2"
    extId = "SampleProject_Build2"
    name = "Build2"

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


/**
 * Created by Julia.Alexandrova on 9/6/2016.
 */
