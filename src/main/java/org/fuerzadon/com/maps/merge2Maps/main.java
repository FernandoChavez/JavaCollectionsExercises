package org.fuerzadon.com.maps.merge2Maps;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        //Escribe un metodo que reciba un Map<String, Integer> y un número n, y devuelva una lista de claves que tengan ese valor.

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('a', 2);
        map1.put('b', 3);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('b', 1);
        map2.put('c', 5);

        //De esta forma se vuelve inmutable
        //Map<Character, Integer> map2 = Map.of('b', 1, 'c', 5);

        Map<Character, Integer> result = methods.merge2Maps(map1, map2);

        for(Map.Entry<Character, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
