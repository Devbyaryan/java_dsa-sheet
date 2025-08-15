package dsa_sheet;

import java.util.Random;

public class MedienOArray {

    static Random rand = new Random();

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 3, 5};
        System.out.println(findMedian(arr));
    }

    static double findMedian(int[] nums) {
        int n = nums.length;
        if (n % 2 == 1) {
            return quickSelect(nums.clone(), 0, n - 1, n / 2);
        } else {
            int left = quickSelect(nums.clone(), 0, n - 1, n / 2 - 1);
            int right = quickSelect(nums.clone(), 0, n - 1, n / 2);
            return (left + right) / 2.0;
        }
    }

    static int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) return nums[left];
        int pivotIndex = left + rand.nextInt(right - left + 1);
        pivotIndex = partition(nums, left, right, pivotIndex);
        if (k == pivotIndex) return nums[k];
        else if (k < pivotIndex) return quickSelect(nums, left, pivotIndex - 1, k);
        else return quickSelect(nums, pivotIndex + 1, right, k);
    }

    static int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivotValue = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
