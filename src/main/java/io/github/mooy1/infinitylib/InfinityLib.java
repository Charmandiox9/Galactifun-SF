package io.github.mooy1.infinitylib;

public final class InfinityLib {

    private InfinityLib() {}

    public static final String VERSION = "1.3.9";

    public static final String PACKAGE = InfinityLib.class.getPackageName();

    public static final String ADDON_PACKAGE = PACKAGE.contains(".") ? PACKAGE.substring(0, PACKAGE.lastIndexOf('.')) : PACKAGE;

}