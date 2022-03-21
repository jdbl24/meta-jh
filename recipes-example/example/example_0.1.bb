SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             	*");
    bb.plain("* Building Custom Layer to support Jailhouse	*");
    bb.plain("*                                             	*");
    bb.plain("***********************************************");
}

addtask display_banner before do_build
