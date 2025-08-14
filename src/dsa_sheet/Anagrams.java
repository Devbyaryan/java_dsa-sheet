package dsa_sheet;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        System.out.println(FindAnagrams(s,t));

    }


    static boolean FindAnagrams(String s,String t){
        Map<Character , Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT =  new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }else{
            for (int i=0; i<s.length();i++){
                mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
                mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
            }
            return mapS.equals(mapT);
        }
    }

}
