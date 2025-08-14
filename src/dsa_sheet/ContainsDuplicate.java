package dsa_sheet;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 3};

        System.out.println(
                Arrays.stream(nums).distinct().count() < nums.length
        );

    }
}
