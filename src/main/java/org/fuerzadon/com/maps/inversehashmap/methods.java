package org.fuerzadon.com.maps.inversehashmap;

import java.util.*;

public class methods {

    public static void reverseHashMap(HashMap<String, Integer> original){
        Map<Integer, List<String>> reverse = new HashMap<>();

        for(Map.Entry<String, Integer> entry : original.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(!reverse.containsKey(value)){
                reverse.put(value, new ArrayList<>());
            }

            //Aqui con get obtenemos el valor existente en el kay "value" y lo que obtenemos es la lista
            //y ya con la lista a la alcance, agregamos el valor "key" con add
            reverse.get(value).add(key);
        }

        for(Map.Entry<Integer, List<String>> entry : reverse.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }



    }
}
