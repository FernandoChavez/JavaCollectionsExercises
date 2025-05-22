package org.fuerzadon.com.linkedlist.stringlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {


        LinkedList<String> frutas = new LinkedList<>();
        frutas.add("manzana");
        frutas.add("naranja");
        frutas.add("uvas");
        frutas.add("peras");
        frutas.add("fresas");

        //Imprimir mediante for
        for(int i = 0; i< frutas.size(); i++){
            System.out.println(frutas.get(i));
        }
        System.out.println();

        //imprimir directamente
        System.out.println(frutas);
        System.out.println();



        ///Insertar y eliminar elementos

        frutas.addFirst("Manzana");
        frutas.addLast("Sandia");
        frutas.remove(2);
        System.out.println(frutas);


        // Buscar elementos
        System.out.println("Existe 'mango'? "+frutas.contains("mango"));
        System.out.println();

        //Recorrer lista

        for(String f : frutas){
            System.out.println(f);
        }
        System.out.println();


        Iterator <String> it = frutas.iterator();
        while(it.hasNext()){
            System.out.println(it);
            System.out.println(it.next());
        }
        System.out.println();

        //Imprimir promedio

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(2);
        nums.add(2);
        nums.add(10);
        nums.add(2);

        methods.avgList(nums);

    }
}
