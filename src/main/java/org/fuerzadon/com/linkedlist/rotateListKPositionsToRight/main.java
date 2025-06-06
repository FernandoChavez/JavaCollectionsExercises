package org.fuerzadon.com.linkedlist.rotateListKPositionsToRight;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        //Rotar la lista k posiciones a la derecha

        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        int k = 2;

        System.out.println(method.rotateList(lista, k));
    }
}
