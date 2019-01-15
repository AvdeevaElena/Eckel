package Chapter17.Task39;


/*Exercise 39
/* Add a private rehash() method to SimpleHashMap that is invoked
* when the load factor exceeds 0.75. During rehashing, double the
* number of buckets, then search for the first prime number greater
* than that to determine the new number of buckets.*/

import Chapter17.Task1.Countries;
import Chapter17.Task16.MapEntry;

import java.util.*;
public class SimpleHashMap<K,V> extends AbstractMap<K,V> {

    static final int SIZE = 997;
    private int capacity = SIZE;

    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K,V>>[] buckets = new LinkedList[SIZE];
    public int capacity() { return capacity; }

    @SuppressWarnings("unchecked")
    private void rehash() {
        capacity = Prime.firstPrimeAfter(capacity * 2);
        LinkedList<MapEntry<K,V>>[] oldBuckets = buckets;
        buckets = new LinkedList[capacity];
        for(LinkedList<MapEntry<K,V>> bucket : oldBuckets) {
            if(bucket == null) continue;
            for(MapEntry<K,V> mpair : bucket)
                this.put(mpair.getKey(), mpair.getValue());
        }
    }
    public V put(K key, V value) {
        // Check and call rehash() if needed:
        if(this.size() > 0.75 * capacity) rehash();
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<MapEntry<K,V>>();
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()) {
            MapEntry<K,V> iPair = it.next();
            if(iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
                break;
            }
        }
        if(!found)
            buckets[index].add(pair);
        return oldValue;
    }
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return null;
        for(MapEntry<K,V> iPair : buckets[index])
            if(iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }
    public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set = new HashSet<Map.Entry<K,V>>();
        for(LinkedList<MapEntry<K,V>> bucket : buckets) {
            if(bucket == null) continue;
            for(MapEntry<K,V> mpair : bucket)
                set.add(mpair);
        }
        return set;
    }
    public static void main(String[] args) {

        System.out.println("Testing map m of <String,String>: the basics:");
        SimpleHashMap<String,String> m = new SimpleHashMap<String,String>();
        m.putAll(Countries.capitals(10));
        System.out.println("m: " + m);
        System.out.println("m.get(\"CHAD\") " + m.get("CHAD"));
        System.out.println("m.size() = " + m.size());
        System.out.println("m.capacity() = " + m.capacity());
        System.out.println("Testing rehash() for a map m2 of <Integer,Integer>:");
        SimpleHashMap<Integer,Integer> m2 = new SimpleHashMap<Integer,Integer>();
        System.out.println("m2: " + m2);
        System.out.println("m2.size() = " + m2.size());
        System.out.println("m2.capacity() = " + m2.capacity());

    }
}

