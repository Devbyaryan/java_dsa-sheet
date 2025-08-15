package dsa_sheet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsorted {

        public static void main(String[] args) {
            int arr[] = {2, 3, 1, 9, 3, 1, 3, 9};

            Set<Integer> seen = new HashSet<>();
            int j = 0;

            for (int num : arr) {
                if (!seen.contains(num)) {
                    seen.add(num);
                    arr[j++] = num;
                }
            }

            while (j < arr.length) {
                arr[j++] = 0;
            }

            System.out.println(Arrays.toString(arr));
        }

}
