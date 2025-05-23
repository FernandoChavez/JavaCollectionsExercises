package org.fuerzadon.com.linkedlist.removeElementsHighertoavalue;

import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
    // Eliminar elementos mayores a un número dada
        //Crea una función que reciba una LinkedList<Integer> y un número n, y elimine todos los elementos mayores que n.

        int num = 5;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(122);
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(4);
        System.out.println("La lista con valores mayores a "+num+" es: "+methods.higherTo(list, num));
    }
}
