package org.fuerzadon.com.linkedlistwithnodes.basicNodeTemplate;

public class MyLinkedList {

    //head es una referencia al primer nodo de la lista enlazada.
    //Sin head, no tienes forma de acceder a ningún elemento, porque todos los nodos están encadenados uno detrás
    // de otro con .next. Por eso muchas veces, al recorrer la lista, usamos un nodo auxiliar:
    private Node head;

    public MyLinkedList(){
        this.head=null;
    }


    // Agregar un nodo al final
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }


    // Imprimir todos los elementos
    public void printList(){
        Node current = head;

        while(current != null){
            System.out.println(current.data + " -> ");
            current= current.next;
        }

        System.out.println("null");
    }


    // Contar nodos
    public int count(){
        int count = 0;
        Node current = head;

        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }


    //Buscar un valor
    public boolean contain(int value){
        Node current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //Eliminar el primer nodo con un calor dado
    public void delete(int value){
        if(head==null)
            return;

        if(head.data == value){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data != value){
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }

    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }

}
