SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i|sun8i|sun50i)"

inherit kernel
require recipes-kernel/linux/linux.inc

SRCBRANCH = "linux-5.4.y"
SRCREV = "8a866bdbbac227a99b0b37e03679908642f58aec"
LOCALVERSION = ""

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i|sun8i|sun50i)"

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;protocol=https;branch=${SRCBRANCH} \
           file://sun4i-a10-pcduino.dts \
           file://defconfig \
          "
# Pull in the devicetree files into the rootfs
RDEPENDS_${KERNEL_PACKAGE_NAME}-base += "kernel-devicetree"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

PROVIDES = "virtual/kernel"

S = "${WORKDIR}/git"

do_import_dts() {
	cd ${WORKDIR}
	cp *.dts ${S}/arch/${ARCH}/boot/dts/
}
addtask import_dts after do_patch before do_configure
