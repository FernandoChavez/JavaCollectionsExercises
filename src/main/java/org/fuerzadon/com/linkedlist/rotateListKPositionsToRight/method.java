package org.fuerzadon.com.linkedlist.rotateListKPositionsToRight;

import java.util.Iterator;
import java.util.LinkedList;

public class method {

    public static LinkedList<Integer> rotateList(LinkedList<Integer> list, int k){

        int n = list.size();

        if(n==0 || k%n == 0) return new LinkedList<>(list);

        /*
        k < n	No cambia nada, sigue siendo k
        k = n	Resultado es 0, lista no cambia
        k > n	Lo reduce a una rotación efectiva dentro del rango de n
         */

        k=k%n;

        LinkedList<Integer> principio = new LinkedList<>(list.subList(0, n-k));
        LinkedList<Integer> parteFInal = new LinkedList<>(list.subList(n-k, n));

        parteFInal.addAll(principio);

        return parteFInal;
    }
}
