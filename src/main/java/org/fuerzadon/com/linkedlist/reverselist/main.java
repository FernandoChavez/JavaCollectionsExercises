package org.fuerzadon.com.linkedlist.reverselist;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList<Character> list = new LinkedList<>();
        list.add('c');
        list.add('4');
        list.add('3');
        list.add('$');
        list.add('1');



        System.out.println("La lista alrevez es " + methods.reverseList(list));
    }
}
