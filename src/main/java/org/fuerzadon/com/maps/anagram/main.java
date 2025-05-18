package org.fuerzadon.com.maps.anagram;

public class main {
    public static void main(String[] args) {

        String s1 = "animal", s2 = "lamina", s3="aaabb", s4="babaa";

        System.out.println(s1 +" y "+ s2 + " son anagramas? "+methods.isAnagram2(s1,s2));
        System.out.println(s3 +" y "+ s4 + " son anagramas? "+methods.isAnagram2(s3,s4));
        System.out.println(s1 +" y "+ s3 + " son anagramas? "+methods.isAnagram2(s1,s3));
    }
}
