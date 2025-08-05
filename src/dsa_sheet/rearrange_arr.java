package dsa_sheet;
import java.util.Arrays;


public class rearrange_arr {
    public static void main(String[] args) {
        Integer arr[] = {8,7,1,6,5,9};

        Arrays.sort(arr);

        for (int i =0;i<arr.length/2;i++){
            System.out.print(arr[i]+ " ");
        }

        for (int i =arr.length-1;i>=arr.length/2;i--){
            System.out.print(arr[i] + " ");
        }
    }


}
