package dsa_sheet;

import java.util.Arrays;

public class HalfIncreasingHalfDecreasing {

    public static void main(String[] args) {
        int arr[]  = {8,7,1,6,5,9};

        Arrays.sort(arr);

        for (int i =0;i<(arr.length)/2; i++){
            System.out.println(arr[i] + " ");
        }

        for (int i=arr.length-1;i>(arr.length-1)/2;i--){
            System.out.println(arr[i] + " ");
        }
    }
}
