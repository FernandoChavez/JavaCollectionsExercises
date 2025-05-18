package org.fuerzadon.com.maps.FrequencyChars;

import java.util.HashMap;
import java.util.Map;

public class methods {

    public static void countFrequencyEachLetters(String word){
        word=word.toLowerCase();
        Map<Character, Integer> result = new HashMap<>();

        char t = 'a';

        for(char c : word.toCharArray()){
            result.put(c, result.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
