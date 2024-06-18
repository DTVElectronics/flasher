SUMMARY = "The lightning-fast ASGI server"
HOMEPAGE = "https://www.uvicorn.org/"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=5c778842f66a649636561c423c0eec2e"

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
