implementation 'androidx.navigation:navigation-fragment:2.3.5'
implementation 'androidx.navigation:navigation-ui:2.3.5'
implementation 'androidx.navigation:navigation-fragment:2.3.5'
implementation 'androidx.navigation:navigation-ui:2.3.5'
implementation 'androidx.constraintlayout:constraintlayout:2.1.1'

implementation 'androidx.appcompat:appcompat:1.2.0'
implementation 'androidx.cardview:cardview:1.0.0'
implementation 'androidx.recyclerview:recyclerview:1.1.0' 
implementation 'com.google.android.material:material:1.4.0'






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



 
implementation 'androidx.legacy:legacy-support-v4:1.0.0' 
implementation 'com.android.support:support-v4:30.0.0'
 
implementation 'com.android.support:design:30.0.0'
implementation 'com.android.support:cardview-v7:30.0.0'

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


