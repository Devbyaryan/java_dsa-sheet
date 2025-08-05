package dsa_sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collections_functions {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));

        Collections.sort(list);                       // [1, 1, 3, 4, 5]
        Collections.reverse(list);                    // [5, 4, 3, 1, 1]
        Collections.shuffle(list);                    // Random order
        Collections.swap(list, 0, 1);                  // Swap first two
        int min = Collections.min(list);               // Minimum element
        int max = Collections.max(list);               // Maximum element
        int freq = Collections.frequency(list, 1);     // Count of 1's

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Frequency of 1: " + freq);
        System.out.println("Final list: " + list);
    }

}
