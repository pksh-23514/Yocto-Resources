DESCRIPTION = "A simple C-program Build to Test Recipe's Shell Logging Mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://program.c"

S = "${WORKDIR}"

do_compile() {
    bbplain "Plain Message"
    bbdebug 1 "Debug Message 1"
    bbdebug 2 "Debug Message 2"
    bbdebug 3 "Debug Message 3"
    bbnote "Note Message"
    ${CC} ${LDFLAGS} program.c -o program
    bbwarn "Warning Message"
    bberror "Error Message"
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 program ${D}${bindir}
}
