package dsa_sheet;

import java.util.*;

public class ReturnMoreThanOne {

    public static void main(String args[]){

        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        System.out.println(Frequency(arr, n));
    }


    static boolean Frequency(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1){
                return true;
            }
        }

        return false;
    }
}
