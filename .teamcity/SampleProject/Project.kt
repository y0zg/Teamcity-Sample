package SampleProject

import SampleProject.buildTypes.*
import SampleProject.vcsRoots.*
import SampleProject.vcsRoots.SampleProject_HttpsGithubComJuliaAlexandrovaSampleProjectRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "8e5eaddf-2032-4378-9586-5d289709ede8"
    extId = "SampleProject"
    parentId = "_Root"
    name = "Sample Project"

    vcsRoot(SampleProject_HttpsGithubComJuliaAlexandrovaSampleProjectRefsHeadsMaster)

    buildType(SampleProject_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_24"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = SampleProject_HttpsGithubComJuliaAlexandrovaSampleProjectRefsHeadsMaster.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
