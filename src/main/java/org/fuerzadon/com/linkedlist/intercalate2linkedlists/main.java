package org.fuerzadon.com.linkedlist.intercalate2linkedlists;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        /*  Intercalar dos LinkedList
        Dadas dos listas, devuélvelas intercaladas:

        java
        Copiar
        Editar
        // Entrada: [1, 3, 5], [2, 4, 6]
        // Salida: [1, 2, 3, 4, 5, 6]
        */

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(11);
        list1.add(0);

        list2.add(22);
        list2.add(1);
        list2.add(8);
        list2.add(3);
        list2.add(33);
        list2.add(77);

        System.out.println(methods.intercalate2list(list1, list2));




    }



}
