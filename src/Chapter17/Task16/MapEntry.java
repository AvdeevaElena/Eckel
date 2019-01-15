package Chapter17.Task16;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MapEntry<K, V> implements Map.Entry<K, V>, Iterable<MapEntry<K, V>>, Comparable<MapEntry<K, V>> {
    private K key;
    private V value;

    private MapEntry<K, V> previous = null;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    MapEntry(K key, V value, MapEntry<K, V> previous) {
        this.key = key;
        this.value = value;
        this.previous = previous;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V v) {
        V result = value;
        value = v;
        return result;
    }

    public MapEntry<K, V> getPrevious() {
        return previous;
    }

    public void setPrevious(MapEntry<K, V> previous) {
        this.previous = previous;
    }

    @Override
    public Iterator<MapEntry<K, V>> iterator() {
        return new Iterator<MapEntry<K, V>>() {
            MapEntry<K, V> current = MapEntry.this;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public MapEntry<K, V> next() {
                MapEntry<K, V> result = current;
                current = current.previous;
                return result;
            }
        };
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (!(otherObject instanceof MapEntry)) {
            return false;
        }
        MapEntry other = (MapEntry) otherObject;
        return Objects.equals(key, other.key);
    }

    public String toString() {
        return key + "=" + value;
    }

    public int size() {
        int size = 0;
        MapEntry<K, V> current = this;
        while (current != null) {
            size++;
            current = current.previous;
        }
        return size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int compareTo(MapEntry<K, V> other) {
        return Integer.compare(key.hashCode(), other.key.hashCode());
    }
}
