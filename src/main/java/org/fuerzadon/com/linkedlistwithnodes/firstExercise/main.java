package org.fuerzadon.com.linkedlistwithnodes.firstExercise;

public class main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printList();
        System.out.println("Tamaño de la lista: "+list.count());

    }
}
