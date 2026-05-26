package de.cronn.reflection.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

public final class ClassUtils {

    private static final String JAVASSIST_CLASS_SEPARATOR = "$$";

    private static final String BYTE_BUDDY_CLASS_SEPARATOR = "$ByteBuddy$";

    private static final String HIBERNATE_OLD_PROXY_CLASS_SEPARATOR = "$HibernateProxy$";

    private static final String HIBERNATE_NEW_PROXY_CLASS_SUFFIX = "$HibernateProxy";

    private static final ClassValue<Set<MethodSignature>> methodsSignaturesCache = ClassValues.create(ClassUtils::getAllDeclaredMethodSignatures);

    private ClassUtils() {
    }

    public static <T> Class<T> getRealClass(T object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Class<T> getRealClass(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T createNewInstanceLike(T source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isFromPackage(Class<?> clazz, String packageName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings(/* this unchecked cast is OK, since this is the contract of newInstance() */
    "unchecked")
    public static <T> T createNewInstance(Class<T> sourceClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T> T createInstance(Constructor<T> constructor, Object... initArgs) throws ReflectiveOperationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getVoidMethodName(T bean, VoidMethod<T> voidMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getVoidMethodName(Class<T> beanClass, VoidMethod<T> voidMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> Method getVoidMethod(Class<T> beanClass, VoidMethod<T> voidMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> Method getMethod(Class<T> beanClass, PropertyGetter<T> getterMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> Method getMethod(T bean, PropertyGetter<T> getterMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getMethodName(T bean, PropertyGetter<T> getterMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getMethodName(Class<T> beanClass, PropertyGetter<T> getterMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> Method getMethod(Class<T> beanClass, VoidMethod<T> voidMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getMethodName(T bean, VoidMethod<T> voidMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getMethodName(Class<T> beanClass, VoidMethod<T> voidMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isProxy(Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isProxyClass(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static boolean matchesWellKnownProxyClassNamePattern(String className) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean haveSameSignature(Method oneMethod, Method otherMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static List<Method> findMethodsByArgumentTypes(Class<?> classToSearchIn, Class<?>... argumentTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean hasMethodWithSameSignature(Class<?> clazz, Method method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Set<Method> getAllDeclaredMethods(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Set<MethodSignature> getAllDeclaredMethodSignatures(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <A extends Annotation> A findAnnotation(Method method, Class<A> annotationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <A extends Annotation> A findAnnotation(Class<?> declaringClass, Method method, Class<A> annotationType) {
        if (declaringClass == null || declaringClass.equals(Object.class)) {
            return null;
        }
        if (declaringClass.getSuperclass() != null) {
            for (Method methodCandidate : declaringClass.getSuperclass().getMethods()) {
                if (isOverride(method, methodCandidate)) {
                    A annotation = findAnnotation(methodCandidate, annotationType);
                    if (annotation != null) {
                        return annotation;
                    }
                }
            }
        }
        for (Class<?> interfaceClass : declaringClass.getInterfaces()) {
            for (Method methodCandidate : interfaceClass.getDeclaredMethods()) {
                if (isOverride(method, methodCandidate)) {
                    A annotation = findAnnotation(methodCandidate, annotationType);
                    if (annotation != null) {
                        return annotation;
                    }
                }
            }
            A annotation = findAnnotation(interfaceClass, method, annotationType);
            if (annotation != null) {
                return annotation;
            }
        }
        return findAnnotation(declaringClass.getSuperclass(), method, annotationType);
    }

    private static boolean isOverride(Method method, Method candidate) {
        return method.getName().equals(candidate.getName()) && candidate.getParameterCount() == method.getParameterCount() && Arrays.equals(candidate.getParameterTypes(), method.getParameterTypes());
    }
}
