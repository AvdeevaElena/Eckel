package Chapter17.Task19;

import Chapter17.Task16.MapEntry;

import java.io.IOException;
import java.util.*;

public class SimpleHashMap<K, V> implements Map<K, V> {
    private static final int SIZE = 997;

        @SuppressWarnings("unchecked")
        private MapEntry<K, V>[] buckets = new MapEntry[SIZE];

        public static void main(String[] args) throws IOException {
            // Exercise 19, 20
            Map<String, Integer> wordCounter = new SimpleHashMap<>();
            for (String s : new TextFile(".gitignore")) {
                wordCounter.put(s, wordCounter.getOrDefault(s, 0) + 1);
            }
            System.out.println(wordCounter);
        }

        @Override
        public int size() {
            int size = 0;
            for (MapEntry<K, V> bucket : buckets) {
                if (bucket != null) {
                    size += bucket.size();
                }
            }
            return size;
        }

        @Override
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override
        public boolean containsKey(Object key) {
            int index = Math.abs(key.hashCode()) % SIZE;
            if (buckets[index] == null) {
                return false;
            }
            for (MapEntry<K, V> entry : buckets[index]) {
                if (entry.getKey().equals(key)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            for (MapEntry<K, V> bucket : buckets) {
                if (bucket != null) {
                    for (MapEntry<K, V> entry : bucket) {
                        if (entry.getValue().equals(value)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override
        public V get(Object key) {
            int index = Math.abs(key.hashCode()) % SIZE;
            if (buckets[index] == null) {
                return null;
            }
            for (MapEntry<K, V> entry : buckets[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
            return null;
        }

    @Override
    public V put(K key, V value) {
        return null;
    }


    @Override
        public V remove(Object key) {
            int index = Math.abs(key.hashCode()) % SIZE;
            if (buckets[index] == null) {
                return null;
            }
            MapEntry<K, V> current = buckets[index];
            if (current.getKey().equals(key)) {
                V value = current.getValue();
                buckets[index] = current.getPrevious();
                return value;
            }
            if (current.getPrevious() != null && !current.getPrevious().getKey().equals(key)) {
                current = current.getPrevious();
            }
            if (current.getPrevious() == null) {
                return null;
            }

            MapEntry<K, V> previous = current.getPrevious();
            current.setPrevious(previous.getPrevious());
            return previous.getValue();
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {
            for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override
        public void clear() {
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = null;
            }
        }
    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (MapEntry<K, V> bucket : buckets) {
            if (bucket != null) {
                for (MapEntry<K, V> entry : bucket) {
                    set.add(entry.getKey());
                }
            }
        }
        return set;
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = new ArrayList<>();
        for (MapEntry<K, V> bucket : buckets) {
            if (bucket != null) {
                for (MapEntry<K, V> entry : bucket) {
                    collection.add(entry.getValue());
                }
            }
        }
        return collection;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        for (MapEntry<K, V> bucket : buckets) {
            if (bucket != null) {
                for (MapEntry<K, V> entry : bucket) {
                    set.add(entry);
                }
            }
        }
        return set;
    }



  }

