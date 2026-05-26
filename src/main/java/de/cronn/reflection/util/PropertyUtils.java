package de.cronn.reflection.util;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;
import org.objenesis.ObjenesisException;
import org.objenesis.ObjenesisHelper;

public final class PropertyUtils {

    private static final ClassValue<PropertyDescriptorCache<?>> cache = ClassValues.create(PropertyDescriptorCache::new);

    private PropertyUtils() {
    }

    @Nullable
    public static PropertyDescriptor getPropertyDescriptorByName(Object bean, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    public static PropertyDescriptor getPropertyDescriptorByName(Class<?> beanClass, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static PropertyDescriptor getPropertyDescriptorByNameOrThrow(Object bean, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static PropertyDescriptor getPropertyDescriptorByNameOrThrow(Class<?> beanClass, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Collection<PropertyDescriptor> getPropertyDescriptors(Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Collection<PropertyDescriptor> getPropertyDescriptors(Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <A extends Annotation> Map<PropertyDescriptor, A> getPropertyDescriptorsWithAnnotation(Object object, Class<A> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <A extends Annotation> Map<PropertyDescriptor, A> getPropertyDescriptorsWithAnnotation(Class<?> type, Class<A> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    static <T> PropertyDescriptorCache<T> getCache(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T copyNonDefaultValues(T source, T destination) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T copyNonDefaultValues(T source, T destination, PropertyDescriptor... excludedProperties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T copyNonDefaultValues(T source, T destination, Collection<PropertyDescriptor> excludedProperties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Object copyValue(T source, T destination, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> boolean hasDefaultValue(T bean, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> boolean hasSameValue(T a, T b, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> boolean hasDifferentValue(T a, T b, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> boolean isDefaultValue(Class<T> objectClass, TypedPropertyGetter<T, ?> propertyGetter, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> boolean isDefaultValue(Class<T> objectClass, PropertyDescriptor propertyDescriptor, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Object getDefaultValue(Class<T> objectClass, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void write(Object destination, String propertyName, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> void writeIfPropertyExists(Object destination, String propertyName, Supplier<T> valueSupplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void write(Object destination, PropertyDescriptor propertyDescriptor, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void write(Object destination, PropertyDescriptor propertyDescriptor, Object value, boolean force) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void writeDirectly(Object destination, PropertyDescriptor propertyDescriptor, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void writeDirectly(Object destination, String propertyName, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void writeDirectly(Object destination, Field field, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Field findField(Class<?> objectClass, String propertyName) throws NoSuchFieldException {
        try {
            return objectClass.getDeclaredField(propertyName);
        } catch (NoSuchFieldException e) {
            Class<?> superclass = objectClass.getSuperclass();
            if (!superclass.equals(Object.class)) {
                return findField(superclass, propertyName);
            }
            throw e;
        }
    }

    public static <T> T readDirectly(Object object, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T readDirectly(Object object, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T readDirectly(Object object, Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T read(Object source, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T read(Object source, PropertyDescriptor propertyDescriptor, boolean force) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T readIfPropertyExists(Object source, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T readProperty(Object entity, PropertyDescriptor propertyDescriptor, Class<T> expectedType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> PropertyDescriptor getPropertyDescriptor(T bean, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> PropertyDescriptor getPropertyDescriptor(Class<T> beanClass, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getPropertyName(Class<T> beanClass, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> String getPropertyName(T bean, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    public static <T> PropertyDescriptor getPropertyDescriptorByMethod(Class<T> beanClass, Method method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    public static <T> PropertyDescriptor getPropertyDescriptorByField(Class<T> beanClass, Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> Method getMethod(Class<T> beanClass, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Method findMethodByGetter(Class<T> beanClass, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T> T createProxy(Class<T> beanClass, MethodCaptor methodCaptor) {
        Class<? extends T> proxyClass = getCache(beanClass).getMethodCapturingProxy();
        try {
            T proxyInstance = ObjenesisHelper.newInstance(proxyClass);
            writeDirectly(proxyInstance, MethodCaptor.FIELD_NAME, methodCaptor);
            return proxyInstance;
        } catch (ObjenesisException e) {
            if (e.getCause() instanceof InvocationTargetException invocationTargetException) {
                if (invocationTargetException.getTargetException() instanceof IllegalAccessError illegalAccessError) {
                    throw new ReflectionRuntimeException("Failed to create proxy on " + beanClass, illegalAccessError);
                }
            }
            throw e;
        } catch (IllegalAccessError e) {
            throw new ReflectionRuntimeException("Failed to create proxy on " + beanClass, e);
        }
    }

    public static boolean hasAnnotationOfProperty(Class<?> entityType, PropertyDescriptor descriptor, Class<? extends Annotation> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T, A extends Annotation> A getAnnotationOfProperty(Class<T> entityType, TypedPropertyGetter<T, ?> propertyGetter, Class<A> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <A extends Annotation> A getAnnotationOfProperty(Object object, PropertyDescriptor descriptor, Class<A> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <A extends Annotation> A getAnnotationOfProperty(Class<?> entityType, PropertyDescriptor descriptor, Class<A> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isFullyAccessible(PropertyDescriptor descriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isWritable(PropertyDescriptor descriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isReadable(PropertyDescriptor descriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isDeclaredInClass(PropertyDescriptor propertyDescriptor, Class<?> entityClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean hasProperty(Object bean, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean hasProperty(Class<?> beanClass, String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Object getDefaultValueObject(Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> String getQualifiedPropertyName(T bean, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> String getQualifiedPropertyName(Class<T> type, TypedPropertyGetter<T, ?> propertyGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getQualifiedPropertyName(Object bean, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getQualifiedPropertyName(Class<?> type, PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getQualifiedPropertyName(Class<?> type, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static String getQualifiedPropertyName(Object bean, Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String getQualifiedPropertyName(Object bean, String name) {
        return getQualifiedPropertyName(ClassUtils.getRealClass(bean), name);
    }

    public static boolean isCollectionType(PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isNotCollectionType(PropertyDescriptor propertyDescriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private interface AccessibleObjectFunction<E, T extends AccessibleObject, R> {

        R access(E object, T accessibleObject) throws ReflectiveOperationException;
    }

    private interface AccessibleObjectConsumer<E, T extends AccessibleObject> {

        void access(E object, T accessibleObject) throws ReflectiveOperationException;
    }

    private static <E, T extends AccessibleObject> void withAccessibleObject(E object, T accessibleObject, AccessibleObjectConsumer<E, T> accessibleObjectConsumer) throws ReflectiveOperationException {
        withAccessibleObject(object, accessibleObject, (obj, accObj) -> {
            accessibleObjectConsumer.access(obj, accObj);
            return null;
        }, true);
    }

    private static <E, T extends AccessibleObject, R> R withAccessibleObject(E object, T accessibleObject, AccessibleObjectFunction<E, T, R> function, boolean force) throws ReflectiveOperationException {
        boolean accessible = accessibleObject.canAccess(object);
        try {
            if (force && !accessible) {
                accessibleObject.setAccessible(true);
            }
            return function.access(object, accessibleObject);
        } finally {
            if (force && !accessible) {
                accessibleObject.setAccessible(false);
            }
        }
    }

    @VisibleForTesting
    static void removeClassFromCache(Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
