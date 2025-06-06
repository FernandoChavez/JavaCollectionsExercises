package org.fuerzadon.com.maps.mostfrequencycharacter;

import java.util.HashMap;
import java.util.Map;

public class methods {

    public static void mostFrequency(String word){

        Map<Character, Integer> map = new HashMap<>();

        char ch[] = word.toCharArray();
        int maxCount = Integer.MIN_VALUE;
        char resultKey = ' ';

        for(char c : ch){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount= entry.getValue();
                resultKey = entry.getKey();

            }
        }

        System.out.println(resultKey+" : "+maxCount);


    }
}
