package de.cronn.reflection.util.immutable.collection;

import de.cronn.reflection.util.immutable.ImmutableProxyOption;
import java.io.Serial;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

public class DeepImmutableList<E> extends DeepImmutableCollection<E> implements List<E> {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final String IMMUTABLE_MESSAGE = "This list is immutable";

    private final List<E> listDelegate;

    public DeepImmutableList(List<E> list, ImmutableProxyOption[] options) {
        super(list, options, IMMUTABLE_MESSAGE);
        this.listDelegate = list;
    }

    public static <T> DeepImmutableList<T> of(T elements, ImmutableProxyOption... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> DeepImmutableList<T> of(T e1, T e2, ImmutableProxyOption... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> DeepImmutableList<T> of(T e1, T e2, T e3, ImmutableProxyOption... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends E> c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void sort(Comparator<? super E> c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
