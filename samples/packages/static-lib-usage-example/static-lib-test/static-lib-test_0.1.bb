DESCRIPTION = "A simple C-program Build using Static Library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://program.c \
"

S = "${WORKDIR}"

# Build-time Dependency for this Recipe.
=> DEPENDS += "hello-static-lib"

do_compile() {
    # Compile C file with Static Library.
    ${CC} ${LDFLAGS} program.c -o program -l_static
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 program ${D}${bindir}
}
