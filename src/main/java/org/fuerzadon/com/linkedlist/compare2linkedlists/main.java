package org.fuerzadon.com.linkedlist.compare2linkedlists;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();

        lista1.add("A");
        lista1.add("B");
        lista1.add("C");

        lista2.add("A");
        lista2.add("B");
        lista2.add("1");

        System.out.println("¿Las 2 listas son iguales? " + methods.compare2Linkedlist(lista1, lista2));
    }
}
