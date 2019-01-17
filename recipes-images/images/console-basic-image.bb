SUMMARY = "A console development image with some extra dev tools"
LICENSE = "MIT"

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us"

inherit core-image

CORE_OS = " \
"

EXTRA_TOOLS_INSTALL = " \
    bzip2 \
    findutils \
    i2c-tools \
    unzip \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${EXTRA_TOOLS_INSTALL} \
"

export IMAGE_BASENAME = "console-basic-image"