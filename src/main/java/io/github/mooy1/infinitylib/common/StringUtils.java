package io.github.mooy1.infinitylib.common;

public final class StringUtils {

    private StringUtils() {}

    public static boolean isBlank(String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        for (char chr : string.toCharArray()) {
            if (!Character.isWhitespace(chr)) {
                return false;
            }
        }
        return true;
    }
}
