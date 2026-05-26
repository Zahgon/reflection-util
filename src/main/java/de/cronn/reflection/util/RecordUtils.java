package de.cronn.reflection.util;

import de.cronn.reflection.util.immutable.ImmutableProxy;
import java.lang.reflect.Constructor;
import java.util.function.Function;

public final class RecordUtils {

    private static final ClassValue<Boolean> recordImmutabilityCache = ClassValues.create(recordClass -> {
        return RecordSupport.getRecordComponents(recordClass).allMatch(recordComponent -> ImmutableProxy.isImmutable(recordComponent.getType()));
    });

    private RecordUtils() {
    }

    public static boolean hasOnlyImmutableRecordComponents(Class<?> recordClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T cloneRecord(T record, Function<Object, Object> valueMapping) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
