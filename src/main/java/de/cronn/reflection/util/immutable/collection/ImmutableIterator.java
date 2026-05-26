package de.cronn.reflection.util.immutable.collection;

import java.util.Iterator;

class ImmutableIterator<E> implements Iterator<E> {

    private final DeepImmutableCollection<E> collection;

    private final Iterator<E> delegate;

    private final String immutableMessage;

    ImmutableIterator(DeepImmutableCollection<E> collection, Iterator<E> delegate, String immutableMessage) {
        this.collection = collection;
        this.delegate = delegate;
        this.immutableMessage = immutableMessage;
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
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
