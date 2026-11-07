plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "in.apnabazaar.preview"
    compileSdk = 35

    defaultConfig {
        applicationId = "in.apnabazaar.preview"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.1-preview"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
