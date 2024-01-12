#This is JetpackCompose example app for Decompose Navigation Library for KMP project


This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…


Android app screens

![Androdi1](https://github.com/HusseinKamal/DecomposeNavigationKMP/assets/29864161/c2463c25-8a1b-46aa-b932-ee8f8464a33f)

![Android2](https://github.com/HusseinKamal/DecomposeNavigationKMP/assets/29864161/2058ca5d-c8d5-464e-a574-d425476ce9e3)


IOS app screen

![Simulator Screen Shot - iPhone 12 Pro Max - 2024-01-13 at 00 55 57](https://github.com/HusseinKamal/DecomposeNavigationKMP/assets/29864161/5bd97386-182d-4008-93f3-7d6c46083874)


![Simulator Screen Shot - iPhone 12 Pro Max - 2024-01-13 at 00 55 39](https://github.com/HusseinKamal/DecomposeNavigationKMP/assets/29864161/0c367621-b0bc-4bba-89bc-ddb81442d4e0)
