COMPATIBLE_MACHINE = "_^"
COMPATIBLE_MACHINE_ntc-chip = "ntc-chip"

FILESEXTRAPATHS_prepend := "${THISDIR}/files/${PN}:"

SRC_URI_append = " \
    file://ya_chip_defconfig \
    file://ya_sun5i-r8-chip.dts \
"


do_chip_uboot_config() {
    install -m 0644 ${WORKDIR}/*_defconfig ${S}/configs 
    install -m 0644 ${WORKDIR}/*-chip.dts ${S}/arch/arm/dts/
}

#do_patch[postfuncs] = "do_chip_uboot_config"
