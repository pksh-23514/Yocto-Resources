DESCRIPTION = "A simple Static Library Build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://maths.c \
    file://static_lib.h \
    file://print.c \
    "

S = "${WORKDIR}"

do_compile() {
    ${CC} -c print.c -o print.o
    ${CC} -c maths.c -o maths.o
    ${AR} rcs lib_static.a maths.o print.o
}

do_install() {
    install -d ${D}${libdir}
    install -m 0755 static_lib.a ${D}${libdir}
    install -d ${D}${includedir}
    install -m 0444 static_lib.h ${D}${includedir}
}
