SUMMARY = "The little ASGI library that shines."
HOMEPAGE = "https://www.starlette.io/"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=11e8c8dbfd5fa373c703de492140ff7a"

SRC_URI = "https://files.pythonhosted.org/packages/61/b5/6bceb93ff20bd7ca36e6f7c540581abb18f53130fabb30ba526e26fd819b/starlette-${PV}.tar.gz"
SRC_URI[sha256sum] = "9af890290133b79fc3db55474ade20f6220a364a0402e0b556e7cd5e1e093823"

S = "${WORKDIR}/starlette-${PV}/starlette"

inherit pypi python_flit_core

DEPENDS:${PN} += "\
    python3-flit-core \
"
