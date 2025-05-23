package org.fuerzadon.com.linkedlist.removeElementsHighertoavalue;

import java.util.Iterator;
import java.util.LinkedList;

public class methods {
    public static LinkedList<Integer> higherTo (LinkedList<Integer> list, int num){

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int current = it.next();
            if(current<=num){
                it.remove();
            }

        }
        return list;
    }
}
