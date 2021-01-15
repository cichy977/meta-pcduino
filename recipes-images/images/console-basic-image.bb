SUMMARY = "A console development image with some extra dev tools"
LICENSE = "MIT"

IMAGE_FEATURES += "package-management ssh-server-openssh"
IMAGE_LINGUAS = "en-us"

inherit core-image


IMAGE_INSTALL += " \
    ${EXTRA_TOOLS_INSTALL} \
"

WIFI_SUPPORT = " \
    crda \
    iw \
    linux-firmware-rtl8192su \
    wpa-supplicant \
"

EXTRA_TOOLS_INSTALL = " \
    bash-completion \
    bzip2 \
    dtc \
    findutils \
    grep \
    i2c-tools \
    less \
    mc \
    nano \
    procps \
    sysfsutils \
    tree \
    unzip \
    wget \
    xz \
    zip \
"

IMAGE_INSTALL += " \
    ${EXTRA_TOOLS_INSTALL} \
    ${WIFI_SUPPORT} \
"

export IMAGE_BASENAME = "console-basic-image"
