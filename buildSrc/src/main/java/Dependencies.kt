/**
 * @author Tao Cheng (tao@paradisehell.org)
 */
object Versions {
    // gradle
    const val gradle = "4.1.1"

    // kotlin
    const val kotlin_gradle_plugin = "1.5.31"

    // android
    const val android_ktx = "1.7.0"
    const val android_appcompat = "1.4.1"
    const val android_material = "1.5.0"

    // test
    const val test_junit = "4.13.2"
    const val test_android_junit = "1.1.3"
    const val test_android_espresso = "3.4.0"
}

object Dependencies {
    // gradle
    const val build_gradle = "com.android.tools.build:gradle:${Versions.gradle}"

    // kotlin
    const val kotlin_gradle_plugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_gradle_plugin}"

    // android
    const val android_core_ktx = "androidx.core:core-ktx:${Versions.android_ktx}"
    const val android_appcompat = "androidx.appcompat:appcompat:${Versions.android_appcompat}"
    const val android_material = "com.google.android.material:material:${Versions.android_material}"

    // test
    const val test_junit = "junit:junit:${Versions.test_junit}"
    const val test_android_junit = "androidx.test.ext:junit:${Versions.test_android_junit}"
    const val test_android_espresso_core =
        "androidx.test.espresso:espresso-core:${Versions.test_android_espresso}"
}
