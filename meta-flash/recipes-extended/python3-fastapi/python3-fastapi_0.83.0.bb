SUMMARY = "FastAPI framework, high performance, easy to learn, fast to code, ready for production"
HOMEPAGE = "https://fastapi.tiangolo.com/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95792ff3fe8e11aa49ceb247e66e4810"

SRC_URI[sha256sum] = "96eb692350fe13d7a9843c3c87a874f0d45102975257dd224903efd6c0fde3bd"

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
