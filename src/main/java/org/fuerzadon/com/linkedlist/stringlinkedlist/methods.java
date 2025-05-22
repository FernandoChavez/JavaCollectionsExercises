package org.fuerzadon.com.linkedlist.stringlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class methods {
    public static void avgList(LinkedList<Integer> nums){
        int suma =0, avg = 0;

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            suma+= it.next();
        }

        avg = suma / nums.size();
        System.out.println("El promedio es: "+avg);

    }
}
