package de.cronn.reflection.util;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

final class MethodSignature implements Comparable<MethodSignature> {

    private final String name;

    private final Class<?> returnType;

    private final Class<?>[] parameterTypes;

    MethodSignature(Method method) {
        this.name = method.getName();
        this.returnType = method.getReturnType();
        this.parameterTypes = method.getParameterTypes();
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Class<?> getReturnType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    @Override
    public int compareTo(MethodSignature other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String mapToString(Class<?>[] list) {
        return Arrays.stream(list).map(Class::getName).collect(Collectors.joining(", "));
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
