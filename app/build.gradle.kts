plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = Versions.android_compile_sdk

    defaultConfig {
        minSdk = Versions.android_min_sdk
        targetSdk = Versions.android_target_sdk

        applicationId = "org.paradisehell.android.kts.template"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }

        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Dependencies.android_core_ktx)
    implementation(Dependencies.android_appcompat)
    implementation(Dependencies.android_material)
    testImplementation(Dependencies.test_junit)
    androidTestImplementation(Dependencies.test_android_junit)
    androidTestImplementation(Dependencies.test_android_espresso_core)
}
