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

SRC_URI[sha256sum] = "efe1acf3e62fb99c288b0ec73e5a773b7268ef4320fe757ea994214e4b63c371"
