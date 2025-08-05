package dsa_sheet;

import java.util.HashMap;
import java.util.Map;

public class frequency_of_each_element_2 {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};

        frequency(arr,arr.length);

    }

    static void frequency(int arr[] , int n){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
