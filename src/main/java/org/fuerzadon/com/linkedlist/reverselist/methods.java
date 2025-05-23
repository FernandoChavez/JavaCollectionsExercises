package org.fuerzadon.com.linkedlist.reverselist;

import java.util.Iterator;
import java.util.LinkedList;

public class methods {

    public static LinkedList<Character> reverseList (LinkedList<Character> list){
        LinkedList<Character> reverse = new LinkedList<>();

        Iterator<Character> it = list.iterator();
        while(it.hasNext()){
            reverse.addFirst(it.next());
        }

        return reverse;
    }
}
