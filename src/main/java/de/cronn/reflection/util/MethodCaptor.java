package de.cronn.reflection.util;

import static net.bytebuddy.matcher.ElementMatchers.*;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.implementation.bind.annotation.FieldValue;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class MethodCaptor {

    static final String FIELD_NAME = "$methodCaptor";

    private final AtomicReference<Method> capturedMethod = new AtomicReference<>();

    void capture(Method method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Method getCapturedMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @RuntimeType
    public static Object intercept(@Origin Method method, @FieldValue(FIELD_NAME) MethodCaptor methodCaptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T> Class<? extends T> createProxyClass(Class<T> beanClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
