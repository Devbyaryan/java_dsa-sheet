package dsa_sheet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};

        int k = removeDuplicates(arr);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0; // pointer for unique position
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // new length
    }
}
