package dsa_sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collections_cheat_sheet {

    public static void main(String[] args) {
        // ======================
        // Arrays & Collections Cheat Sheet
        // ======================

        // ----- 1. Create a List from Array -----
        String[] arr = {"C", "A", "B"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        // O(n) → Copies n elements from array to list
        System.out.println("Original list: " + list);

        // ----- 2. Reverse -----
        Collections.reverse(list);
        // O(n) → Swaps elements
        System.out.println("Reverse: " + list);

        // ----- 3. Sort (Ascending) -----
        Collections.sort(list);
        // O(n log n) → TimSort
        System.out.println("Sorted Asc: " + list);

        // ----- 4. Sort (Descending) -----
        Collections.sort(list, Collections.reverseOrder());
        // O(n log n)
        System.out.println("Sorted Desc: " + list);

        // ----- 5. Shuffle -----
        Collections.shuffle(list);
        // O(n) → Fisher-Yates shuffle
        System.out.println("Shuffled: " + list);

        // ----- 6. Swap elements -----
        Collections.swap(list, 0, 1);
        // O(1)
        System.out.println("After swap: " + list);

        // ----- 7. Fill -----
        Collections.fill(list, "X");
        // O(n)
        System.out.println("After fill: " + list);

        // ----- 8. Copy -----
        List<String> src = Arrays.asList("A", "B", "C");
        List<String> dest = new ArrayList<>(Arrays.asList("", "", ""));
        Collections.copy(dest, src);
        // O(n)
        System.out.println("After copy: " + dest);

        // ----- 9. Min / Max -----
        List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5);
        int minVal = Collections.min(nums); // O(n)
        int maxVal = Collections.max(nums); // O(n)
        System.out.println("Min: " + minVal + ", Max: " + maxVal);

        // ----- 10. Frequency -----
        int freq = Collections.frequency(nums, 1);
        // O(n)
        System.out.println("Frequency of 1: " + freq);

        // ----- 11. Replace All -----
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "apple", "orange"));
        Collections.replaceAll(fruits, "apple", "banana");
        // O(n)
        System.out.println("Replace all: " + fruits);

        // ----- 12. Unmodifiable List -----
        List<String> readOnlyList = Collections.unmodifiableList(fruits);
        // O(1) wrapper
        System.out.println("Unmodifiable: " + readOnlyList);
        // readOnlyList.add("grape"); // throws UnsupportedOperationException

        // ----- 13. Synchronized List -----
        List<String> syncList = Collections.synchronizedList(new ArrayList<>(fruits));
        // O(1) wrapper
        System.out.println("Synchronized: " + syncList);

        // ----- 14. Arrays sort -----
        int[] numbers = {5, 3, 1, 4, 2};
        Arrays.sort(numbers);
        // O(n log n)
        System.out.println("Arrays.sort: " + Arrays.toString(numbers));

        // ----- 15. Arrays parallelSort (faster for large arrays) -----
        int[] bigArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.parallelSort(bigArr);
        // O(n log n) but parallelized
        System.out.println("Arrays.parallelSort: " + Arrays.toString(bigArr));

        // ----- 16. Arrays fill -----
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 42);
        // O(n)
        System.out.println("Arrays.fill: " + Arrays.toString(fillArr));

        // ----- 17. Arrays binarySearch -----
        int index = Arrays.binarySearch(numbers, 3);
        // O(log n) → requires sorted array
        System.out.println("Index of 3: " + index);
    }
}
