#!/bin/bash

set -e -u


SDK_REVISION=9123335
ANDROID_SDK_FILE=commandlinetools-linux-${SDK_REVISION}_latest.zip
ANDROID_SDK_SHA256=0bebf59339eaa534f4217f8aa0972d14dc49e7207be225511073c661ae01da0a
NDK_VERSION=25b
ANDROID_NDK_FILE=android-ndk-r${NDK_VERSION}-linux.zip
ANDROID_NDK_SHA256=403ac3e3020dd0db63a848dcaba6ceb2603bf64de90949d5c4361f848e44b005

	mkdir -p "/root/lib"
	cd "/root/lib/"
	
	# https://developer.android.com/studio/index.html#command-tools
	echo "Downloading Android SDK..."
	wget -c https://dl.google.com/android/repository/${ANDROID_SDK_FILE}
	rm -Rf android-sdk
	unzip -q ${ANDROID_SDK_FILE} -d android-sdk

	# https://developer.android.com/ndk/downloads
	echo "Downloading Android NDK..."
	wget -c https://dl.google.com/android/repository/${ANDROID_NDK_FILE}
	rm -Rf android-ndk-r${NDK_VERSION}
	unzip -q ${ANDROID_NDK_FILE}
	yes | /root/lib/android-sdk/cmdline-tools/bin/sdkmanager --sdk_root="/root/lib/android-sdk" --licenses
	yes | /root/lib/android-sdk/cmdline-tools/bin/sdkmanager --sdk_root="/root/lib/android-sdk" "platform-tools" "build-tools;32.0.0" "platforms;android-30"
