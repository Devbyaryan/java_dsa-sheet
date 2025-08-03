package dsa_sheet;

public class largest_element_in_array {

    public static void main(String[] args) {
        int arr1[] = {1, 5, 2, 8};
        System.out.println(largestElement(arr1));
    }

    static int largestElement(int arr[]) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max){
                max = num;
            }
        }

        return max;
    }
}
