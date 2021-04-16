SUMMARY = "A small image just capable of allowing EC9700 to boot"
LICENSE = "GPL"

inherit core-image


##############################
# Supporting files
##############################

FILESEXTRAPATHS_prepend :=  "${THISDIR}/files:"
SRC_URI_append = " \
    "


##############################
# Image Options
##############################
#  wsdd2 
IMAGE_INSTALL = " \
    packagegroup-core-boot lrzsz dropbear \
    "

IMAGE_LINGUAS = " "

IMAGE_FEATURES =+ " \
    package-management \
    "

IMAGE_ROOTFS_SIZE ?= "9216"


##############################
# Customerzation
##############################

