# Robin Sebastian (https://github.com/robseb) (git@robseb.de) 2019-2023

SUMMARY = "Tool to load a new FPGA Configuration for Intel SoC-FPGAs"
DESCRIPTION = "Tool to change via the Intel FPGA Manger the FPGA configuration of a Intel SoC-FPGA"  
SECTION = "rstools" 
LICENSE = "MIT"
PR = "r0"
BRANCH ="main"
LIC_FILES_CHKSUM = "file://CHECKSUMFILE;md5=bff2b7959c4b3958a8ae19f6a39a59ac"
SRC_URI = "gitsm://github.com/robseb/rstools.git;protocol=https;branch=${BRANCH}"
SRCREV = "${AUTOREV}"

# This Version is for the Intel Cyclone V SoC-FPGA
COMPATIBLE_MACHINE = 'cyclone5'

inherit cmake

S = "${WORKDIR}/git/FPGA-writeConfig"
FILES_${PN} += "${bindir}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 FPGA-writeConfig ${D}${bindir}
}
