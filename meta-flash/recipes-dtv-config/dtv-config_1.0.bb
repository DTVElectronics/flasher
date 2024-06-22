SUMMARY = "DTV Configuration"
LICENSE = "MIT"

inherit extrausers

hostname:pn-base-files = "cmrat"

cleanup_rootfs() {
	rm ${IMAGE_ROOTFS}/etc/nginx/sites-enabled/default_server
}

ROOTFS_POSTPROCESS_COMMAND += "cleanup_rootfs;"
