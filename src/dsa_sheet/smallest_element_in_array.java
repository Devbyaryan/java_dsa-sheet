package dsa_sheet;

public class smallest_element_in_array {

    public static void main(String[] args) {

        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The smallest element in the array is: " + smallestElement(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The smallest element in the array is: " + smallestElement(arr2));
    }

    static int smallestElement(int arr[]) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
