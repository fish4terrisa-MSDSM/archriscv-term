#!/bin/bash

set -e -u


SDK_REVISION=9123335
ANDROID_SDK_FILE=commandlinetools-linux-${SDK_REVISION}_latest.zip
ANDROID_SDK_SHA256=0bebf59339eaa534f4217f8aa0972d14dc49e7207be225511073c661ae01da0a
NDK_VERSION=25b
ANDROID_NDK_FILE=android-ndk-r${NDK_VERSION}-linux.zip
ANDROID_NDK_SHA256=403ac3e3020dd0db63a848dcaba6ceb2603bf64de90949d5c4361f848e44b005

	mkdir -p "~/lib"
	cd "~/lib/.."
	
	# https://developer.android.com/studio/index.html#command-tools
	echo "Downloading Android SDK..."
	wget -c https://dl.google.com/android/repository/${ANDROID_SDK_FILE} \
		tools-${SDK_REVISION}.zip 
	rm -Rf android-sdk
	unzip tools-${SDK_REVISION}.zip -d android-sdk

	# https://developer.android.com/ndk/downloads
	echo "Downloading Android NDK..."
	wget -c https://dl.google.com/android/repository/${ANDROID_NDK_FILE} \
		ndk-r${NDK_VERSION}.zip 
	rm -Rf android-ndk-r${NDK_VERSION}
	unzip ndk-r${TERMUX_NDK_VERSION}.zip
