import java.util.LinkedList;

class HashMapCustom<K, V> {
    // Node for key-value pair
    private class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16; // default capacity
    private LinkedList<Entry<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public HashMapCustom() {
        buckets = new LinkedList[capacity];
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Put key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Update value if key already exists
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // Insert new key-value pair
        buckets[index].add(new Entry<>(key, value));
    }

    // Get value by key
    public V get(K key) {
        int index = getBucketIndex(key);

        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null; // key not found
    }

    // Remove key
    public void remove(K key) {
        int index = getBucketIndex(key);

        if (buckets[index] != null) {
            buckets[index].removeIf(entry -> entry.key.equals(key));
        }
    }

    // Check if key exists
    public boolean containsKey(K key) {
        return get(key) != null;
    }
}

// Testing custom HashMap
public class ImplementationHashMap {
    public static void main(String[] args) {
        HashMapCustom<String, Integer> map = new HashMapCustom<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Value for key B: " + map.get("B")); // 2

        map.put("B", 20); // update
        System.out.println("Updated value for key B: " + map.get("B")); // 20

        map.remove("A");
        System.out.println("Value for key A after removal: " + map.get("A")); // null
    }
}
