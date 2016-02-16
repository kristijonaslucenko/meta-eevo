# inherit phygittag
# inherit buildinfo
USER = "kristijonaslucenko"
require common/recipes-bsp/barebox/barebox.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}/features:${THISDIR}:"

SRC_URI = "git://github.com/${USER}/ccu-bootloader.git;branch=v2015.02.0-phy"
SRC_URI_append = " \
    file://commonenv \
    file://environment \
    file://targettools.cfg \
"
S = "${WORKDIR}/git"
BAREBOX_LOCALVERSION = "-${BSP_VERSION}"

# NOTE: Keep version in filename in sync with commit id and barebox-ipl!
SRCREV = "573a2926d4595ee2b5888f436a21d4cbf3507d85"


# eb699b609649147f2706b2c86a9599275bdecbdf

COMPATIBLE_MACHINE = "beagleboneblack-1"
COMPATIBLE_MACHINE .= "|phyboard-maia-am335x-1"
COMPATIBLE_MACHINE .= "|phyboard-wega-am335x-1"
COMPATIBLE_MACHINE .= "|phyboard-wega-am335x-2"
COMPATIBLE_MACHINE .= "|phycore-am335x-1"
COMPATIBLE_MACHINE .= "|phycore-am335x-2"
COMPATIBLE_MACHINE .= "|phyflex-am335x-1"
