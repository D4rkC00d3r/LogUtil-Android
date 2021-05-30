# LogUtil-Android

## Introduction
Android library for working with Log file in Android SDK written in Kotlin. This library has an example APK to show how to use the library in the releases.


Add it in your root build.gradle at the end of repositories:

  	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


Add the dependency

	dependencies {
	        implementation 'com.github.D4rkC00d3r:LogUtil-Android:Tag'
	}
  
Sync project.


## Example of use

In your project where you want to make a log file call it like this.

	LogDebug().debugLog(LogDebug().tag, "This is my debug message.")


In the logcat you will see an entry like this. Click on the entry and it will jump you to the place in code that the debug entry is.


	com.d4rkc00d3r.logutilexample D/DEBUG: (MainActivity.kt:12) This is my debug message.

## Build
This repository is configured for GitHub actions and as such a APK is built on push and pull. The APK can be downloaded from the actions artifact.

## Unit Tests

I have started implementing unit tests within the librarys "test" folder.

	LogDebugTest 
	
This can be run directly on on the JVM and does not require a physicial device or the emulator. This is why I have not implemented "androidTest" as it is not needed in this example.
