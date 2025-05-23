package org.fuerzadon.com.linkedlist.compare2listperindex;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        //Dadas dos listas del mismo tamaño, devuelve una nueva LinkedList<String> con "IGUAL" si los elementos son iguales, o "DIFERENTE" si no.
        LinkedList<String> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();

        lista1.add("A");
        lista1.add("B");
        lista1.add("C");

        lista2.add("A");
        lista2.add("B");
        lista2.add("1");

        System.out.println(methods.compareIndexList(lista1, lista2));
    }
}
