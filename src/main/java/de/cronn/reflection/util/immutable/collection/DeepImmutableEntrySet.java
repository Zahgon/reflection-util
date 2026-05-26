package de.cronn.reflection.util.immutable.collection;

import java.io.Serial;
import java.util.Map.Entry;
import java.util.Set;

class DeepImmutableEntrySet<K, V> extends DeepImmutableCollection<Entry<K, V>> implements Set<Entry<K, V>> {

    @Serial
    private static final long serialVersionUID = 1L;

    private final DeepImmutableMap<K, V> immutableMap;

    DeepImmutableEntrySet(Set<Entry<K, V>> entrySet, DeepImmutableMap<K, V> immutableMap) {
        super(entrySet, immutableMap.options, DeepImmutableMap.IMMUTABLE_MESSAGE);
        this.immutableMap = immutableMap;
    }

    @Override
    Entry<K, V> createImmutableElement(Entry<K, V> entry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class ImmutableEntry<K, V> implements Entry<K, V> {

        private final Entry<K, V> delegate;

        private final transient DeepImmutableMap<K, V> immutableMap;

        ImmutableEntry(Entry<K, V> delegate, DeepImmutableMap<K, V> immutableMap) {
            this.delegate = delegate;
            this.immutableMap = immutableMap;
        }

        @Override
        public K getKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public V getValue() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public V setValue(V value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
