package org.fuerzadon.com.maps.merge2Maps;

import java.util.HashMap;
import java.util.Map;

public class methods {

    public static Map<Character, Integer> merge2Maps(Map<Character, Integer> map1, Map<Character, Integer> map2){

        Map<Character, Integer> result = map1;

        for(Map.Entry<Character, Integer> entry: map2.entrySet()){
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(),0) + entry.getValue());
        }

        return result;
    }
}
