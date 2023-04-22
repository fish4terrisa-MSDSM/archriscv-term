#!/data/data/com.termux/files/usr/bin/bash
cd ~/RVVM
rm -rf ~/RVVM/release.android.arm64
git pull
make USE_X11=0 USE_FB=0 USE_NET=1
cp ~/RVVM/release.android.arm64/rvvm_arm64 ~/archriscv-term/archriscv-app/app/src/main/jniLibs/arm64-v8a/librvvm.so
