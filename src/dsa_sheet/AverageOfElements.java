package dsa_sheet;

public class AverageOfElements {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

       System.out.println( Average(arr));

    }


    static int Average(int[] arr){
        int sum = 0;

        for(int i : arr){
            sum += i;
        }

        return sum / arr.length;

    }
}
