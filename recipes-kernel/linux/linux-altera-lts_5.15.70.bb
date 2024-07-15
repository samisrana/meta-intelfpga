## Robin Sebastian (https://github.com/robseb) (git@robseb.de) 2019-2023

SUMMARY = "Linux Kernel 5.15.70 LTS for Intel PSG (ALTERA) SoC-FPGAs"
DESCRIPTION = "Linux Kernel 5.15.70 LTS for Intel PSG (ALTERA) SoC-FPGAs" 


LINUX_VERSION = "5.15.70"
LINUX_VERSION_SUFFIX = "-lts"

# Note: Sat Aug 7 00:04:18 2021 +0900
SRCREV = "48a0dc4da8ceef0219bd49b81facf52843249874"
SRCREV:machine:cyclone5 ?= "48a0dc4da8ceef0219bd49b81facf52843249874"
include linux-altera.inc

LICENSE = "MIT & Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46 \
                    file://Documentation/COPYING-logo;md5=083a0dda06508a120bf32ddff670398b \
                    file://Documentation/process/license-rules.rst;md5=ca74e55fc53c93556c55eb4db13190ed \
                    file://Documentation/scsi/LICENSE.FlashPoint;md5=ef7704635ba02fb27f5e524565d54c10 \
                    file://Documentation/translations/it_IT/process/license-rules.rst;md5=6df263ada12c886cd576cb0592cd64d5 \
                    file://Documentation/translations/zh_CN/process/license-rules.rst;md5=2692d82e86da49de2f15472365875637 \
                    file://Documentation/translations/zh_TW/process/license-rules.rst;md5=5da2e9405f123496829753c2620ac3b3 \
                    file://LICENSES/deprecated/GPL-1.0;md5=bf22c04ca6f38a97ce863a18d690d0f9 \
                    file://LICENSES/preferred/GPL-2.0;md5=e6a75371ba4d16749254a51215d13f97 \
                    file://LICENSES/preferred/LGPL-2.0;md5=0e1dd121ad1021213d7de823991892f5 \
                    file://LICENSES/preferred/LGPL-2.1;md5=b370887980db5dd40659b50909238dbd \
                    file://drivers/iio/adc/navassa/third_party/jsmn/LICENSE;md5=5adc94605a1f7a797a9a834adbe335e3 \
                    file://drivers/net/LICENSE.SRC;md5=e5e50f92b87d827b29e6e79e05432963 \
                    file://drivers/net/wireless/marvell/libertas/LICENSE;md5=4ea603c400089f5e404cc5e453d17bc5 \
                    file://fs/jffs2/LICENCE;md5=fcd40f6cb09221b0782c1d09ba266911 \
                    file://include/linux/license.h;md5=b87e387897564e2a7745ce95b49147cf \
                    file://tools/usb/usbip/COPYING;md5=1f6f1c0be32491a0c8d2915607a28f36"
