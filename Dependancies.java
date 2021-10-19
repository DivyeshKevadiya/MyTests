---------------Android X Basic Libraries---------------
implementation 'androidx.navigation:navigation-fragment:2.3.5'
implementation 'androidx.navigation:navigation-ui:2.3.5'
implementation 'androidx.navigation:navigation-fragment:2.3.5'
implementation 'androidx.navigation:navigation-ui:2.3.5'
implementation 'androidx.constraintlayout:constraintlayout:2.1.1'

implementation 'androidx.appcompat:appcompat:1.2.0'
implementation 'androidx.cardview:cardview:1.0.0'
implementation 'androidx.recyclerview:recyclerview:1.1.0' 
implementation 'com.google.android.material:material:1.4.0'





---------------Usefull Libraries---------------
implementation 'de.hdodenhof:circleimageview:3.1.0'
implementation 'com.aapbd:appbajar-lib:1.0.2'
implementation 'com.android.volley:volley:1.2.1'
implementation 'com.pushbots:pushbots-lib:2.0.13@aar'
implementation 'com.squareup:otto:1.3.8'
implementation 'androidx.multidex:multidex:2.0.1'
implementation 'com.squareup.picasso:picasso:2.71828
implementation 'com.intuit.sdp:sdp-android:1.0.6'
implementation 'com.appodeal.ads.sdk:core:2.7.3'
implementation 'com.github.hotchemi:android-rate:1.0.1'
implementation 'com.kaopiz:kprogresshud:1.1.0'
implementation 'com.github.javiersantos:AppUpdater:2.7'
implementation 'com.kaopiz:kprogresshud:1.2.0'
implementation 'com.onesignal:OneSignal:3.14.0'
implementation 'com.google.code.gson:gson:2.8.5'

implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-scalars:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation 'com.squareup.okhttp3:okhttp:4.9.0'
implementation 'com.squareup.okhttp3:logging-interceptor:4.9.0'
 
implementation 'com.squareup.okhttp3:logging-interceptor:3.8.0'
def room_version = "2.3.0"
implementation "androidx.room:room-runtime:$room_version"
annotationProcessor "androidx.room:room-compiler:$room_version"
implementation 'com.github.chaya222:AndroidOtpView:0.0.2'
implementation 'com.android.volley:volley:1.2.0'
 
implementation 'com.google.firebase:firebase-auth:20.0.4'
implementation 'com.google.firebase:firebase-database:19.7.0'
implementation 'com.google.firebase:firebase-messaging:22.0.0' 
 
implementation "androidx.core:core-ktx:+"
implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
implementation "android.arch.persistence.room:runtime:1.1.1"
kapt "android.arch.persistence.room:compiler:1.1.1" 
 
implementation 'net.danlew:android.joda:2.9.9.4'
implementation 'com.github.PhilJay:MPAndroidChart:v3.0.3'
implementation 'com.facebook.android:facebook-login:4.34.0'
implementation 'se.emilsjolander.stickylistheaders:library:2.1.0'
implementation 'com.stripe:stripe-android:6.1.2'
implementation 'com.budiyev.android:code-scanner:1.9.4'
implementation 'com.github.mabbas007:TagsEditText:1.0.5'
implementation 'com.chauthai.swipereveallayout:swipe-reveal-layout:1.4.1'
implementation 'com.github.mabbas007:TagsEditText:1.0.5'
implementation 'info.hoang8f:android-segmented:1.0.6'

 
 

----------------------------Scanner---------------------------
implementation 'me.dm7.barcodescanner:zbar:1.9.3'
implementation 'me.dm7.barcodescanner:zxing:1.9.3'
 
 
 



----------------------------V4---------------------------
implementation 'androidx.legacy:legacy-support-v4:1.0.0' 
implementation 'com.android.support:support-v4:30.0.0'
 
implementation 'com.android.support:design:30.0.0'
implementation 'com.android.support:cardview-v7:30.0.0'

 
-----------------------Generate APK Format-----------------------
buildTypes {
        debug {
            minifyEnabled false
            shrinkResources false
            proguardFiles 'proguard-rules.txt', getDefaultProguardFile('proguard-android.txt')
            android.applicationVariants.all { variant ->
                variant.outputs.all {
                    outputFileName = "${applicationId}-${variant.name}-v${versionName}.apk"
                }
            }
        }
        release {
            minifyEnabled false
            shrinkResources false
            proguardFiles 'proguard-rules.txt', getDefaultProguardFile('proguard-android.txt')
            signingConfig getSigningConfig()
            android.applicationVariants.all { variant ->
                variant.outputs.all {
                    outputFileName = "${applicationId}-${variant.name}-v${versionName}.apk"
                }
            }
        }
    }

-----------------------Signing Config-----------------------
signingConfigs {
        config {
            keyAlias 'EvaKey'
            keyPassword 'avdevs@123'
            storeFile file('E:\\dump\\eva-android\\eva-keystore.jks')
            storePassword 'avdevs@123'
        }
        configCollabera {
            keyAlias 'collaberakey'
            keyPassword '0utofmind'
            storeFile file('E:\\dump\\eva-android\\collabera-keystore.jks')
            storePassword '0utofmind'
        }
    }


     buildFeatures {
        dataBinding true
        viewBinding true
    }


