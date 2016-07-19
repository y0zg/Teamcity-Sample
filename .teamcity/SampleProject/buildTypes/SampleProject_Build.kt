package SampleProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object SampleProject_Build : BuildType({
    uuid = "e2a86c69-4227-48e3-b879-cd879176f766"
    extId = "SampleProject_Build"
    name = "Build"

    steps {
        maven {
            goals = "package"
            userSettingsPath = ""
            param("maven.home", "")
        }
    }

    vcs {
        root(SampleProject.vcsRoots.SampleProject_HttpsGithubComJuliaAlexandrovaSampleProjectRefsHeadsMaster)

    }

    triggers {
        vcs {
        }
    }
})
