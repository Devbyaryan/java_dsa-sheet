package dsa_sheet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = {3,4,5,6};
        int target = 7;

        int result[] =   twoSums(nums,target);

        System.out.print(Arrays.toString(result));
    }


//    brute force approach
//    static void twoSums(int nums[],int target){
//        for (int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i] != nums[j] && nums[i] + nums[j] == target){
//                    System.out.println(nums[i] + " " + nums[j]);
//                }
//            }
//        }
//    }


    static int[] twoSums(int nums[],int target){

        Map<Integer,Integer> indices = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            indices.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diff  = target - nums[i];

            if(indices.containsKey(diff) && indices.get(diff) !=  i){
                return new int[]{i,indices.get(diff)};
            }
        }

        return new int[0];
    }


}
