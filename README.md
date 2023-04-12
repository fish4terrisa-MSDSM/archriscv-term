# Archlinux riscv64 Term
<p align="center"><img src="logo.png" width="20%"></p>

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/fish4terrisa-MSDSM/archriscv-term/tree/flyingfish.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/fish4terrisa-MSDSM/archriscv-term/tree/flyingfish)

---------------------------------

## Introduction

- Archlinux riscv64 Term is a terminal and Linux environment application for Android.
A key difference of other terminal applications is that it uses
[Arch Linux](https://archlinux.org/) running inside the headless
riscv64 machine emulated with [RVVM](https://github.com/LekKit/RVVM). Interaction
with the operating system is done through terminals which are attached to
the serial consoles of the virtual machine.

## Usage
 - Config the path of kernel,opensbi image,raw disk image in the settings.
 - You can get the image using [CoelacanthusHex/archriscv-scriptlet](https://github.com/CoelacanthusHex/archriscv-scriptlet)
 - A prebuilt kernel is provided [linux_6.0.zip](https://github.com/LekKit/RVVM/files/10044110/linux_6.0.zip) , which is built by [LekKit](https://github.com/LekKit)
 - A demo image is not provided now.(May be provided later....It may take me some time:-( )
## System requirements

 - AArch64-based device.
 - Android 7.0+
 - At least 2GB RAM available.
 - At least 5GB of space on the internal storage.
 - Internet (if you want to install/update packages).
## Screenshot
<p align="left"><img src="demo.jpg" width="40%"></p>

## Building
 - Just like normal gradle project , run `cd archriscv-app && gradle build`
 - [![CircleCI](https://dl.circleci.com/insights-snapshot/gh/fish4terrisa-MSDSM/archriscv-term/flyingfish/build/badge.svg?window=30d)](https://app.circleci.com/insights/github/fish4terrisa-MSDSM/archriscv-term/workflows/build/overview?branch=flyingfish&reporting-window=last-30-days&insights-snapshot=true)
## Credits

Archlinux riscv64 Term utilizes source code of the following projects:

 - [Termux](https://github.com/termux/termux-app)
 - [RVVM](https://github.com/LekKit/RVVM)
 - [Bash](http://www.gnu.org/software/bash/bash.html)
 - [Busybox](https://busybox.net)
 - [Socat](http://www.dest-unreach.org/socat/)
 - [Advanced Copy](https://github.com/jarun/advcpmv)
 - [Alpine Term](https://github.com/ichit/alpine-term)
 - (I cannot find the source of alpine-term,this is a clone from @ichit)
