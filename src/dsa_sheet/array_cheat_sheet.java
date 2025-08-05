package dsa_sheet;

import java.util.Arrays;

public class array_cheat_sheet {
        public static void main(String[] args) {
            // ----- 1. sort() - Ascending -----
            int[] arr = {5, 2, 8, 1, 3};
            Arrays.sort(arr); // O(n log n) → Dual-Pivot QuickSort
            System.out.println("Sorted Asc: " + Arrays.toString(arr));

            // ----- 2. sort() - with range -----
            int[] arr2 = {9, 7, 5, 3, 1};
            Arrays.sort(arr2, 1, 4); // Sorts index 1..3 only, O(k log k)
            System.out.println("Partial sort: " + Arrays.toString(arr2));

            // ----- 3. parallelSort() -----
            int[] arr3 = {8, 6, 4, 2, 0};
            Arrays.parallelSort(arr3); // O(n log n) parallelized
            System.out.println("Parallel sort: " + Arrays.toString(arr3));

            // ----- 4. fill() -----
            int[] fillArr = new int[5];
            Arrays.fill(fillArr, 42); // O(n)
            System.out.println("Fill: " + Arrays.toString(fillArr));

            // ----- 5. fill() - with range -----
            int[] rangeFill = {1, 2, 3, 4, 5};
            Arrays.fill(rangeFill, 1, 4, 99); // O(k)
            System.out.println("Range fill: " + Arrays.toString(rangeFill));

            // ----- 6. binarySearch() -----
            int[] sortedArr = {1, 3, 5, 7, 9};
            int idx = Arrays.binarySearch(sortedArr, 5); // O(log n) → requires sorted array
            System.out.println("Index of 5: " + idx);

            // ----- 7. equals() -----
            int[] a1 = {1, 2, 3};
            int[] a2 = {1, 2, 3};
            System.out.println("Equals: " + Arrays.equals(a1, a2)); // O(n)

            // ----- 8. compare() (Java 9+) -----
            // Negative if a1 < a2, zero if equal, positive if a1 > a2
            System.out.println("Compare: " + Arrays.compare(a1, a2)); // O(n)

            // ----- 9. mismatch() (Java 9+) -----
            // First index where arrays differ, or -1 if same
            int[] m1 = {1, 2, 3, 4};
            int[] m2 = {1, 2, 0, 4};
            System.out.println("Mismatch index: " + Arrays.mismatch(m1, m2)); // O(n)

            // ----- 10. copyOf() -----
            int[] original = {1, 2, 3};
            int[] copy = Arrays.copyOf(original, 5); // O(n)
            System.out.println("CopyOf: " + Arrays.toString(copy));

            // ----- 11. copyOfRange() -----
            int[] copyRange = Arrays.copyOfRange(original, 1, 3); // O(k)
            System.out.println("CopyOfRange: " + Arrays.toString(copyRange));

            // ----- 12. toString() -----
            System.out.println("toString: " + Arrays.toString(original)); // O(n)

            // ----- 13. deepToString() (for multi-dimensional arrays) -----
            int[][] multi = {{1, 2}, {3, 4}};
            System.out.println("DeepToString: " + Arrays.deepToString(multi)); // O(n)

            // ----- 14. deepEquals() -----
            int[][] deepA1 = {{1, 2}, {3, 4}};
            int[][] deepA2 = {{1, 2}, {3, 4}};
            System.out.println("DeepEquals: " + Arrays.deepEquals(deepA1, deepA2)); // O(n)

            // ----- 15. setAll() (Java 8+) -----
            int[] setArr = new int[5];
            Arrays.setAll(setArr, i -> i * i); // Fills with function: index², O(n)
            System.out.println("SetAll: " + Arrays.toString(setArr));

            // ----- 16. parallelSetAll() -----
            int[] pSetArr = new int[5];
            Arrays.parallelSetAll(pSetArr, i -> i + 10); // O(n) parallelized
            System.out.println("ParallelSetAll: " + Arrays.toString(pSetArr));

            // ----- 17. stream() -----
            int sum = Arrays.stream(new int[]{1, 2, 3, 4}).sum(); // O(n)
            System.out.println("Stream sum: " + sum);

            // ----- 18. asList() -----
            Integer[] boxed = {10, 20, 30};
            System.out.println("AsList: " + Arrays.asList(boxed)); // O(1) wrapper (fixed-size)
        }

}
