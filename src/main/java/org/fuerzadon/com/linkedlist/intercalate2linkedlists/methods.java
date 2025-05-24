package org.fuerzadon.com.linkedlist.intercalate2linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class methods {

    public static LinkedList<Integer> intercalate2list (LinkedList<Integer> list, LinkedList<Integer> list2) {

        LinkedList<Integer> resultado = new LinkedList<>();

        Iterator<Integer> it1 = list.iterator();
        Iterator<Integer> it2 = list2.iterator();
        while(it1.hasNext() || it2.hasNext()){
            if(it1.hasNext()){
                resultado.add(it1.next());
            }
            if(it2.hasNext()){
                resultado.add(it2.next());
            }
        }



        return resultado;
    }

}
