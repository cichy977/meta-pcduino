SUMMARY = "A x11 development image with some extra dev tools"
LICENSE = "MIT"

IMAGE_FEATURES += " x11-base"

inherit console-basic-image


IMAGE_INSTALL += " \
    ${EXTRA_TOOLS_INSTALL} \
"

EXTRA_TOOLS_INSTALL = " \
    x11vnc \
    "

export IMAGE_BASENAME = "x11-basic-image"
