package dsa_sheet;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        // brute force approach


//        int i=0;
//        int j = arr.length-1;
//
//        while (arr[i] != arr[j]){
//            int n = 0;
//            n = arr[j];
//            arr[j] = arr[i];
//            arr[i] = n;
//
//            i++;
//            j--;
//        }
//
//        for(int n=0;n<arr.length;n++){
//            System.out.println(arr[n]);
//        }
//    }

        Collections.reverse(Arrays.asList(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
