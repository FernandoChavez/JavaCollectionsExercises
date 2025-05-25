package org.fuerzadon.com.linkedlistwithnodes.basicNodeTemplate;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.addFirst(5);
        list.printList();

        System.out.println("Count: "+list.count());
        System.out.println("Contain 20? "+list.contain(20));

        list.delete(10);
        list.printList();


    }
}
