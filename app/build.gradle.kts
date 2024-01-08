plugins {
    id("com.android.application")
}

android {
    namespace = "com.duodevloopers.teammanagement"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.duodevloopers.teammanagement"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }



    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.22")

//    def nav_version = "2.3.5"

//    // Java language implementation
//    implementation("androidx.navigation:navigation-fragment:$nav_version")
//    implementation("androidx.navigation:navigation-ui:$nav_version")
//
//    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")
//
//    // Testing Navigation
//    androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")

//    // Jetpack Compose Integration
//    implementation("androidx.navigation:navigation-compose:2.4.0-alpha06")
//
//    //apply plugin: "androidx.navigation.safeargs"
//
//    implementation("com.google.android.material:material:1.4.0")
//
//    implementation("com.thoughtbot:expandablerecyclerview:1.4")
//
//    implementation("com.github.denzcoskun:ImageSlideshow:0.0.6")
//
//    implementation("com.cepheuen.elegant-number-button:lib:1.0.3")
//
//    implementation("com.google.android.gms:play-services-maps:17.0.1")
//    implementation("com.google.android.gms:play-services-location:18.0.0")
//
//    //easy permission
//    implementation("com.karumi:dexter:6.2.3")

    //firebase
//    implementation platform('com.google.firebase:firebase-bom:28.4.0')
//    implementation('com.google.firebase:firebase-analytics')
//    implementation('com.google.firebase:firebase-database')
//    implementation('com.google.firebase:firebase-storage')
//    implementation('com.google.firebase:firebase-auth')
//    implementation('com.firebaseui:firebase-ui-auth:7.2.0')
//    implementation 'com.google.firebase:firebase-auth-ktx'
//    implementation 'com.firebaseui:firebase-ui-database:7.2.0'
//    implementation 'com.firebaseui:firebase-ui-firestore:8.0.0'
//    implementation 'com.google.firebase:firebase-firestore'


//    // easy permission
//    implementation("com.vmadalin:easypermissions-ktx:1.0.0")
//
//    //image picker
//    implementation("com.github.dhaval2404:imagepicker:2.1")
//
//    //animation
//    implementation("com.airbnb.android:lottie:3.4.2")
//
//    implementation("br.com.simplepass:loading-button-android:1.14.0")
//
//    //qr and barcode
//    implementation("com.journeyapps:zxing-android-embedded:3.4.0")
//    implementation("com.google.zxing:core:3.4.0")
//
//    // retrofit
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//
//    //pdf
//    implementation("com.itextpdf:itext7-core:7.0.2")
//
//    // otp view
//    implementation("com.github.mukeshsolanki:android-otpview-pinview:2.1.2")
//
//    // glide
//    implementation("com.github.bumptech.glide:glide:4.12.0")
//    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
//
//    // image slider
//    implementation("com.synnapps:carouselview:0.1.5")
//
//    // web view
//    implementation("com.thefinestartist:finestwebview:1.2.7")
}