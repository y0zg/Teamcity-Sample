package SampleProject.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object SampleProject_HttpsGithubComJuliaAlexandrovaSampleProjectRefsHeadsMaster : GitVcsRoot({
    uuid = "e8d130b9-9f55-48d5-9905-2e69983a877a"
    extId = "SampleProject_HttpsGithubComJuliaAlexandrovaSampleProjectRefsHeadsMaster"
    name = "https://github.com/Julia-Alexandrova/Sample-Project#refs/heads/master"
    url = "https://github.com/Julia-Alexandrova/Sample-Project"
    authMethod = password {
        userName = "Julia-Alexandrova"
        password = "zxx71c43efc2e32b217b2ea7d02ce188352"
    }
})
