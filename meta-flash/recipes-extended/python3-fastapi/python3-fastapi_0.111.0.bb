SUMMARY = "FastAPI framework, high performance, easy to learn, fast to code, ready for production"
HOMEPAGE = "https://fastapi.tiangolo.com/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95792ff3fe8e11aa49ceb247e66e4810"

SRC_URI[sha256sum] = "b9db9dd147c91cb8b769f7183535773d8741dd46f9dc6676cd82eab510228cd7"

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += "\
    python3-pydantic \
    python3-starlette \
"

DEPENDS += "\
    python3-pdm-native \
    python3-pdm-backend-native \
"
