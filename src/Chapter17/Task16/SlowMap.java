package Chapter17.Task16;


/* Exercise 16
// Apply the tests in Maps.java to SlowMap to verify that it works.
// Fix anything in SlowMap that doesn't work properly. */

import java.io.IOException;
import java.util.*;
public class SlowMap <K,V>  implements Map<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordCounter = new SlowMap<>();
        for (String s : new TextFile("SomeText.java")) {
            wordCounter.put(s, wordCounter.getOrDefault(s, 0) + 1);
        }
        System.out.println(wordCounter);
    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return keys.contains(key);
    }

    @SuppressWarnings("unckecked")
    @Override
    public boolean containsValue(Object value) {
        return values.contains(value);
    }

    @Override
    public V get(Object key) {
        if (!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }

    @Override
    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else
            values.set(keys.indexOf(key), value);
        return oldValue;
    }

    @Override
    public V remove(Object key) {
        V value = get(key);
        keys.remove(key);
        values.remove(value);
        return value;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        keys.clear();
        values.clear();
    }

    @Override
    public Set<K> keySet() {
        return new AbstractSet<K>() {
            @Override
            public Iterator<K> iterator() {
                return keys.iterator();
            }

            @Override
            public int size() {
                return keys.size();
            }
        };
    }

    @Override
    public Collection<V> values() {
        return values;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext())
            set.add(new MapEntry<>(ki.next(), vi.next()));
        return set;
    }
}
