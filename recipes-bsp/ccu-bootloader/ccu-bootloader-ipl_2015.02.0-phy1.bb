# inherit phygittag
# inherit buildinfo
USER = "kristijonaslucenko"
require common/recipes-bsp/barebox/barebox-ipl.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/barebox/features:"

SRC_URI = "git://github.com/${USER}/ccu-bootloader.git;branch=v2015.02.0-phy"
S = "${WORKDIR}/git"
BAREBOX_LOCALVERSION = "-${BSP_VERSION}"

SRCREV = "fd2f794f7f9853ae64e459c8fc4762871c7f1b15"
# eb699b609649147f2706b2c86a9599275bdecbdf
COMPATIBLE_MACHINE = "beagleboneblack-1"
COMPATIBLE_MACHINE .= "|phyboard-maia-am335x-1"
COMPATIBLE_MACHINE .= "|phyboard-wega-am335x-1"
COMPATIBLE_MACHINE .= "|phyboard-wega-am335x-2"
COMPATIBLE_MACHINE .= "|phycore-am335x-1"
COMPATIBLE_MACHINE .= "|phycore-am335x-2"
COMPATIBLE_MACHINE .= "|phyflex-am335x-1"
