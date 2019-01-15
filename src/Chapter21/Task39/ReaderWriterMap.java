package Chapter21.Task39;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderWriterMap <K, V> implements Map<K, V> {


    private HashMap<K, V> lockedMap;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public ReaderWriterMap(Map<? extends K, ? extends V> m) {
        lockedMap = new HashMap<>(m);
    }

    @Override
    public int size() {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.size();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.isEmpty();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean containsKey(Object key) {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.containsKey(key);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean containsValue(Object value) {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.containsValue(value);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public V get(Object key) {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.get(key);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public V put(K key, V value) {
        Lock writeLock = lock.writeLock();
        writeLock.lock();
        try {
            return lockedMap.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public V remove(Object key) {
        Lock writeLock = lock.writeLock();
        writeLock.lock();
        try {
            return lockedMap.remove(key);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        Lock writeLock = lock.writeLock();
        writeLock.lock();
        try {
            lockedMap.putAll(m);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void clear() {
        Lock writeLock = lock.writeLock();
        writeLock.lock();
        try {
            lockedMap.clear();
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public Set<K> keySet() {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.keySet();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public Collection<V> values() {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.values();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return lockedMap.entrySet();
        } finally {
            readLock.unlock();
        }
    }
}