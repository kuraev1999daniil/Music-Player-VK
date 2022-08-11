@file:Suppress("UnstableApiUsage")

include(":compose_extensions")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "VK-Music-Player"

include(":app")
include(":login")
include(":themes")
include(":colors")

