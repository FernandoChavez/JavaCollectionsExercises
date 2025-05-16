package org.fuerzadon.com.maps.hasduplicates;

import java.util.HashMap;
import java.util.Map;

public class methods {

    public static boolean hasDuplicates(int [] nums){

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>1){
                return true;
            }
        }

        return false;
    }
}
