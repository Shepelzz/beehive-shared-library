package org.beehive.lib.utils;

public class EnumUtils {

    public static <T extends Enum<T>> T getEnumFromStringSafe(Class<T> enumClass, String value, T defaultValue) {
        for (T type : enumClass.getEnumConstants()) {
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        return defaultValue;
    }
}
