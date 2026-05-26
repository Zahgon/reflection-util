package de.cronn.reflection.util;

import java.util.function.Supplier;

final class Assert {

    private Assert() {
    }

    static void isNull(Object value, Supplier<String> message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void notNull(Object value, Supplier<String> message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void isTrue(boolean condition, Supplier<String> message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
