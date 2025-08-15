package dsa_sheet;

import java.util.HashMap;
import java.util.Map;

public class FIndDuplicatesFrequency {
    public static void main(String[] args) {

        int arr[] = {10,5,10,15,10,5};

        HashMap<Integer,Integer> numbers = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(numbers.containsKey(arr[i])){
                numbers.put(arr[i],numbers.get(arr[i])+1);
            }else{
                numbers.put(arr[i],1);
            }
        }


        for (Map.Entry<Integer, Integer> map : numbers.entrySet()){
            System.out.println(
                    map.getKey() + " " + map.getValue()
            );
        }
    }
}
