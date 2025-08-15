package dsa_sheet;

import java.util.Arrays;
import java.util.Collections;

public class SortIncreasingAndDescrising {
    public static void main(String[] args) {
        Integer arr[] = {8, 7, 1, 6, 5, 9};
        IncreasingOrder(arr);
        System.out.println("Increasing Order");
        DecreasingOrder(arr, arr.length);
        System.out.print("Decreasing Order");
    }


    static void DecreasingOrder(Integer arr[], int n) {
        Arrays.sort(arr, Collections.reverseOrder());

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    static void IncreasingOrder(Integer arr[]) {
        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}