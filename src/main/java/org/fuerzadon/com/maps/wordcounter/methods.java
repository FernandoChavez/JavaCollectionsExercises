package org.fuerzadon.com.maps.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class methods {

    public static void wordCounter(String [] words){
        Map<String, Integer> map = new HashMap<>();

        for(String w : words){
            map.put(w, map.getOrDefault(w,0)+1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
