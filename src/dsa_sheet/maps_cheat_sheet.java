package dsa_sheet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps_cheat_sheet {


        public static void main(String[] args) {
            // ======================
            // Java Map Cheat Sheet (HashMap Focus)
            // ======================

            // ----- 1. Create a Map -----
            Map<Integer, Integer> map = new HashMap<>();
            // HashMap: O(1) average for put/get/remove, O(n) worst case (rare)
            // TreeMap: O(log n) for put/get/remove (sorted order)
            // LinkedHashMap: O(1) with insertion order preserved

            // ----- 2. Insert (put) -----
            map.put(1, 100); // O(1)
            map.put(2, 200);
            map.put(3, 300);
            System.out.println("Map: " + map);

            // ----- 3. Update -----
            map.put(2, 250); // Overwrites existing key
            System.out.println("Updated Map: " + map);

            // ----- 4. Get value by key -----
            int val = map.get(2); // O(1)
            System.out.println("Value at key 2: " + val);

            // ----- 5. Get value with default -----
            int valDefault = map.getOrDefault(4, -1); // O(1)
            System.out.println("Value at key 4: " + valDefault);

            // ----- 6. Check key exists -----
            boolean hasKey = map.containsKey(3); // O(1)
            System.out.println("Contains key 3? " + hasKey);

            // ----- 7. Check value exists -----
            boolean hasValue = map.containsValue(250); // O(n)
            System.out.println("Contains value 250? " + hasValue);

            // ----- 8. Remove key -----
            map.remove(1); // O(1)
            System.out.println("After removing key 1: " + map);

            // ----- 9. Replace value -----
            map.replace(2, 260); // O(1)
            System.out.println("After replace: " + map);

            // ----- 10. Iterate over keys -----
            System.out.print("Keys: ");
            for (Integer key : map.keySet()) { // O(n)
                System.out.print(key + " ");
            }
            System.out.println();

            // ----- 11. Iterate over values -----
            System.out.print("Values: ");
            for (Integer value : map.values()) { // O(n)
                System.out.print(value + " ");
            }
            System.out.println();

            // ----- 12. Iterate over entries -----
            System.out.println("Entries:");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // O(n)
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            // ----- 13. forEach with Lambda -----
            map.forEach((k, v) -> System.out.println(k + ": " + v)); // O(n)

            // ----- 14. Size -----
            System.out.println("Size: " + map.size()); // O(1)

            // ----- 15. isEmpty -----
            System.out.println("Is empty? " + map.isEmpty()); // O(1)

            // ----- 16. Clear all -----
            map.clear(); // O(n)
            System.out.println("After clear: " + map);

            // ======================
            // Bonus: TreeMap (Sorted Keys)
            // ======================
            TreeMap<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(3, "C");
            treeMap.put(1, "A");
            treeMap.put(2, "B");
            System.out.println("TreeMap (sorted keys): " + treeMap); // O(log n) ops

            // First/Last Key
            System.out.println("First key: " + treeMap.firstKey()); // O(log n)
            System.out.println("Last key: " + treeMap.lastKey());   // O(log n)

            // ======================
            // Bonus: LinkedHashMap (Insertion Order)
            // ======================
            LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
            linkedMap.put(2, "B");
            linkedMap.put(1, "A");
            linkedMap.put(3, "C");
            System.out.println("LinkedHashMap (insertion order): " + linkedMap);
        }


}
