package de.cronn.reflection.util.immutable.collection;

import de.cronn.reflection.util.immutable.Immutable;
import de.cronn.reflection.util.immutable.ImmutableProxy;
import de.cronn.reflection.util.immutable.ImmutableProxyOption;
import java.io.Serial;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class DeepImmutableCollection<E> extends AbstractCollection<E> implements Collection<E>, Immutable, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final Collection<E> delegate;

    protected final ImmutableProxyOption[] options;

    private final String immutableMessage;

    private final Map<E, E> immutableProxyCache = new IdentityHashMap<>();

    public DeepImmutableCollection(Collection<E> delegate, ImmutableProxyOption[] options) {
        this(delegate, options, "This collection is immutable");
    }

    DeepImmutableCollection(Collection<E> delegate, ImmutableProxyOption[] options, String immutableMessage) {
        this.delegate = Objects.requireNonNull(delegate);
        this.options = options;
        this.immutableMessage = immutableMessage;
    }

    E getImmutableElement(E element) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    E createImmutableElement(E value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean add(E t) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
