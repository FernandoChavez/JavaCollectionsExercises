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


        for(int i = 0; i<s1.length(); i++){
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i),0)+1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0)+1);
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
