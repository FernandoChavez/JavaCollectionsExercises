package org.fuerzadon.com.maps.anagram;

import java.util.HashMap;
import java.util.Map;

public class methods {

    public static boolean isAnagram(String s1, String s2){

        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        if(s1.length() != s2.length()) return false;

        Map<Character, Integer> s1Count = new HashMap<>();
        Map<Character, Integer> s2Count = new HashMap<>();

        for(char c : s1.toCharArray()){
            s1Count.put(c, s1Count.getOrDefault(c,0)+1);
        }

        for(char c : s2.toCharArray()){
            s2Count.put(c, s2Count.getOrDefault(c,0)+1);
        }

        return s1Count.equals(s2Count);
    }


    public static boolean isAnagram2(String s1, String s2){
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        if(s1.length() != s2.length()) return false;

        Map<Character, Integer> counts = new HashMap<>();

        for(char c : s1.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0)+1);
        }

        for(char c : s2.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0)-1);
            if(counts.get(c) == 0){
                counts.remove(c);
            }
        }

        return counts.isEmpty();

    }

}
