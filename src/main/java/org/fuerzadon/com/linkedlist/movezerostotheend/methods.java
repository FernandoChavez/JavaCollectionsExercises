package org.fuerzadon.com.linkedlist.movezerostotheend;

import java.util.Iterator;
import java.util.LinkedList;

public class methods {
    public static LinkedList<Integer> zerosToTheEnd(LinkedList<Integer> list){

        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Integer> zeros = new LinkedList<>();

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int current = it.next();
            if(current!=0) {
                numbers.add(current);
            }
            else {
                zeros.add(current);
            }
        }

        numbers.addAll(zeros);
        return  numbers;
    }
}
