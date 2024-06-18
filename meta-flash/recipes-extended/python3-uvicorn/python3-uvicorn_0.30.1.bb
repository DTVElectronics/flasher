SUMMARY = "The lightning-fast ASGI server"
HOMEPAGE = "https://www.uvicorn.org/"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=206119e27d6b034e7ce70d73063c82a8"

RDEPENDS_${PN} = "\
    python3-click \
    python3-h11 \
    python3-httptools \
    python3-typing \
    python3-uvloop \
    python3-websockets \
    python3-wsproto \
"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    python3-anyio \
"

SRC_URI[sha256sum] = "d46cd8e0fd80240baffbcd9ec1012a712938754afcf81bce56c024c1656aece8"
