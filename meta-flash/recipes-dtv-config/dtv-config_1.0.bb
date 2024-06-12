SUMMARY = "DTV Configuration"
LICENSE = "MIT"

inherit extrausers

EXTRA_USERS_PARAMS = "\
    usermod -p 'dtv' root; \
    "
