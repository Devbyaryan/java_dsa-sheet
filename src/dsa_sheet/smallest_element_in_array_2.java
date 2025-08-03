package dsa_sheet;

public class smallest_element_in_array_2 {
    public static void main(String[] args) {
        int arr1[] = { 2,5,1,3,0,5,2,-1};
        System.out.println("The smallest element in array is " + smallestElement(arr1));
    }

    static int smallestElement(int arr[]){
        int min = arr[0];
        for(int num:arr){
            if(num < min){
                min =num;
            }
        }

        return min;
    }
}
