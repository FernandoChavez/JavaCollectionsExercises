package org.fuerzadon.com.maps.firstnotrepeatedchar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class methods {

    public static Character firstNotRepeatedChar(String word){
        Map<Character, Integer> repeated = new LinkedHashMap<>();
        char[] ch = word.toCharArray();

        for(char c : ch){
            repeated.put(c, repeated.getOrDefault(c, 0)+1);
        }

        for(char c : ch){
            if(repeated.get(c)==1){
                return c;
            }
        }
        return null;
    }
}