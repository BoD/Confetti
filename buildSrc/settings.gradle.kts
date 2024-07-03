dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

pluginManagement {
    listOf(repositories, dependencyResolutionManagement.repositories).forEach {
        it.apply {
            maven {
                url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            }
            mavenCentral()
            google()
            gradlePluginPortal()
        }
    }
}