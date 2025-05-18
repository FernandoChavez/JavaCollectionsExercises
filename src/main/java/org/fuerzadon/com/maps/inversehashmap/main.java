package org.fuerzadon.com.maps.inversehashmap;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        //Dado un Map<String, Integer>, crea un nuevo Map<Integer, List<String>> que agrupe las claves originales por sus valores.


        Map<String, Integer> original = Map.of("Juan", 1, "Ana", 2 , "Luis", 1);

        methods.reverseHashMap(new HashMap<>(original));
    }
}

