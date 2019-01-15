package Chapter17.Task14;

import Chapter17.Task5.CountingMapData;

import java.util.Map;
import java.util.Properties;

public class MapProperties {
    public static void printKeys(Map<Integer,String> map) {
        System.out.println("Size = " + map.size() + ", ");
        System.out.println("Keys: ");
        System.out.println(map.keySet()); // Produce a set of the keys
    }
    // more general version, taking Map<Object,Object> arg:
    public static void printKeys2(Map<Object,Object> map) {
        System.out.println("Size = " + map.size() + ", ");
        System.out.println("Keys: ");
        System.out.println(map.keySet()); // Produce a set of the keys
    }
    public static void test(Map<Integer,String> map) {
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData());
        // Map has 'Set' behavior for keys:
        map.putAll(new CountingMapData());
        printKeys(map);
        // Producing a collection of the values:
        System.out.println("Values: ");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): " + map.containsKey(11));
        System.out.println("map.get(11): " + map.get(11));
        System.out.println("map.containsValue(\"F0\"): " + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First key in map: " + key);
        map.remove(key);
        printKeys(map);
        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData());
        // Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }
    // more general version, taking Map<Object,Object> arg:
    public static void test2(Map<Object,Object> map) {
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData());
        // Map has 'Set' behavior for keys:
        map.putAll(new CountingMapData());
        printKeys2(map);
        // Producing a collection of the values:
        System.out.println("Values: ");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): " + map.containsKey(11));
        System.out.println("map.get(11): " + map.get(11));
        System.out.println("map.containsValue(\"F0\"): " + map.containsValue("F0"));
        Object key = map.keySet().iterator().next();
        System.out.println("First key in map: " + key);
        map.remove(key);
        printKeys2(map);
        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData());
        // Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }
    public static void main(String[] args) {
        // Method test(Map<Integer,String>() cannot be applied:
        // test(new java.util.Properties());
        // test(new Properties());
        // test(new HashMap<Object,Object>());
        // test(new HashMap<String,String>());
        // Incompatible:
        // Map<Integer,String> misp = new Properties();
        // Map<String,String> mssp = new Properties();
        // OK:
        Map<Object,Object> moop = new Properties();
        // but test(Map<Integer,String>() cannot be applied:
        // test(moop);
        // Using more general version, taking Map<Object,Object> arg:
        test2(new Properties()); // OK
    }
}
