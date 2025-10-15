DESCRIPTION = "A simple Dynamic Library Build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://maths.c \
    file://dynamic_lib.h \
    file://print.c \
    "

S = "${WORKDIR}"

do_compile() {
    ${CC} -c -fPIC print.c -o print.o
    ${CC} -c -fPIC maths.c -o maths.o
    ${CC} ${LDFLAGS} -shared -Wl,-soname,lib_dynamic.so.1 -o lib_dynamic.so.1.0 *.o
}

do_install() {
    install -d ${D}${libdir}
    install -m 0755 lib_dynamic.so.1.0 ${D}${libdir}
    # SONAME Link to Dynamic Library.
    ln -s lib_dynamic.so.1.0 ${D}${libdir}/lib_dynamic.so.1
    # LINKER NAME Link to SONAME Link.
    ln -s lib_dynamic.so.1 ${D}${libdir}/lib_dynamic.so
    install -d ${D}${includedir}
    install -m 0444 dynamic_lib.h ${D}${includedir}
}
