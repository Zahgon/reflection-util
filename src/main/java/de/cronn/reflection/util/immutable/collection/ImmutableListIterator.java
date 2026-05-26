package de.cronn.reflection.util.immutable.collection;

import java.util.ListIterator;

class ImmutableListIterator<E> implements ListIterator<E> {

    private final DeepImmutableList<E> list;

    private final ListIterator<E> delegate;

    ImmutableListIterator(DeepImmutableList<E> list, ListIterator<E> delegate) {
        this.list = list;
        this.delegate = delegate;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public E next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasPrevious() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public E previous() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int nextIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int previousIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void set(E t) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void add(E t) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
