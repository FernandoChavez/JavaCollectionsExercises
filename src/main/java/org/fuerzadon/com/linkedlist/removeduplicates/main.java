package org.fuerzadon.com.linkedlist.removeduplicates;


import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        //Crea una función que reciba una LinkedList<Integer> y elimine todos los elementos duplicados, conservando solo la primera ocurrencia.
        LinkedList <Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(6);
        nums.add(1);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(2);

        System.out.println("Lista de valores sin duplicados: "+methods.removeDuplicates(nums));

    }

}

