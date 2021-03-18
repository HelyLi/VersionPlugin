package cn.today.version.plugin

object BuildConfig {
    val compileSdkVersion = 28
    val buildToolsVersion = "28.0.3"
    val minSdkVersion = 21
    val targetSdkVersion = 28
    val versionCode = 100
    val versionName = "1.0.0"
}

object Versions {
    val retrofit = "2.9.0"
    val okhttpLogging = "3.9.0"
    val appcompat = "1.1.0"
    val coreKtx = "1.3.2"
    val constraintlayout = "2.0.4"
    val paging = "3.0.0-alpha10"
    val timber = "4.7.1"
    val kotlin = "1.4.21"
    val koin = "2.1.5"
    val work = "2.2.0"
    val room = "2.3.0-alpha03"
    val cardview = "1.0.0"
    val recyclerview = "1.2.0-beta01"
    val fragment = "1.3.0-rc01"
    val anko = "0.10.8"
    val swiperefreshlayout = "1.1.0"
    val junit = "4.12"
    val junitExt = "1.1.2"
    val espressoCore = "3.3.0"
    val jDatabinding = "1.0.1"
    val runtime = "0.11.0"
    val hilt = "2.30-alpha"
    val hiltViewModule = "1.0.0-alpha02"
    val appStartup = "1.0.0"
    val DataStore = "1.0.0-alpha05"
    val glide = "4.11.0"
    val navigation = "2.3.2"
    val lifecycle = "2.2.0"
    val activity = "1.2.0-rc01"
}

object AndroidX {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"


    val activity = "androidx.activity:activity:${Versions.activity}"
    val activityKtx = "androidx.activity:activity-ktx:${Versions.activity}"

    val workRuntime = "androidx.work:work-runtime:${Versions.work}"
    val workTesting = "androidx.work:work-testing:${Versions.work}"
    val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val swiperefreshlayout =
            "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayout}"

    val startupRuntime = "androidx.startup:startup-runtime:${Versions.appStartup}"
}

object Hilt {
    val daggerRuntime = "com.google.dagger:hilt-android:${Versions.hilt}"
    val daggerCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    val viewModule = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModule}"
    val compiler = "androidx.hilt:hilt-compiler:${Versions.hiltViewModule}"
}

object DataStore {
    val datastorePreferences = "androidx.datastore:datastore-preferences:${Versions.DataStore}"
    val datastorePreferencesCore =
            "androidx.datastore:datastore-preferences-core:${Versions.DataStore}"
    val protobuf = "com.google.protobuf:protobuf-javalite:3.12.2"
}

object Coil {
    val runtime = "io.coil-kt:coil:${Versions.runtime}"
}

object Room {
    val runtime = "androidx.room:room-runtime:${Versions.room}"
    val compiler = "androidx.room:room-compiler:${Versions.room}"
    val ktx = "androidx.room:room-ktx:${Versions.room}"
    val rxjava2 = "androidx.room:room-rxjava2:${Versions.room}"
    val testing = "androidx.room:room-testing:${Versions.room}"
}

object Fragment {
    val runtime = "androidx.fragment:fragment:${Versions.fragment}"
    val runtimeKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Lifecycle {
    val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    val compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"

    val livedata = "androidx.lifecycle:lifecycle-livedata:${Versions.lifecycle}"
    val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    val viewmodel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}"
    val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
}

object Navigation {
    val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val uiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

object Paging {
    val runtime = "androidx.paging:paging-runtime:${Versions.paging}"
    val rxjava2 = "androidx.paging:paging-rxjava2:${Versions.paging}"
    val rxjava2Ktx = "androidx.paging:paging-rxjava2-ktx:${Versions.paging}"
}

object Kt {
    val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Koin {
    val core = "org.koin:koin-core:${Versions.koin}"
    val androidCore = "org.koin:koin-android:${Versions.koin}"
    val viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val androidScope = "org.koin:koin-android-scope:$${Versions.koin}"
}

object Anko {
    val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
    val sqlite = "org.jetbrains.anko:anko-sqlite:${Versions.anko}"
    val coroutines = "org.jetbrains.anko:anko-coroutines:${Versions.anko}"
    val design = "org.jetbrains.anko:anko-design:${Versions.anko}" // For SnackBars
}

object Retrofit {
    val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
}

object Depend {

    val junit = "junit:junit:${Versions.junit}"
    val androidTestJunit = "androidx.test.ext:junit:${Versions.junitExt}"
    val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val jDatabinding = "com.hi-dhl:jdatabinding:${Versions.jDatabinding}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val stetho = "com.facebook.stetho:stetho:1.5.1"
    val leakcanary = "com.squareup.leakcanary:leakcanary-android:2.5"
}

object Glide {
    val runtime = "com.github.bumptech.glide:glide:${Versions.glide}"
    val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

