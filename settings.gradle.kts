/*
 * Copyright (C) 2025 Nicholas Doglio
 * SPDX-License-Identifier: MIT
 */

rootProject.name = "KotlinProjectTemplate"

pluginManagement {
    repositories {
        exclusiveContent {
            forRepository { google() }
            filter {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroup("com.google.testing.platform")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        exclusiveContent {
            forRepository { google() }
            filter {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroup("com.google.testing.platform")
            }
        }
        mavenCentral()
    }
}

plugins {
    id("com.gradle.develocity") version "3.19.2"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2.1"
}

develocity {
    buildScan {
        termsOfUseUrl = "https://gradle.com/terms-of-service"
        termsOfUseAgree = "yes"
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")
