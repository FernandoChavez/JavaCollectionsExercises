package org.fuerzadon.com.linkedlist.movezerostotheend;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        //Dada una LinkedList<Integer>, mueve todos los ceros al final manteniendo el orden de los demás elementos.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(5);
        list.add(1);

        System.out.println("La lista con los 0 al final seria: " + methods.zerosToTheEnd(list));
    }

}
