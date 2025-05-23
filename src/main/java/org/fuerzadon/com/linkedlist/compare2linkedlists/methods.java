package org.fuerzadon.com.linkedlist.compare2linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class methods {

    public static <T> boolean compare2Linkedlist(LinkedList<T> list1, LinkedList<T> list2){

        if((list1.size() != list2.size())){
            return false;
        }

        Iterator<T> it1= list1.iterator();
        Iterator<T> it2= list2.iterator();

        while(it1.hasNext() && it2.hasNext()){
            String e1 = (String) it1.next();
            String e2 = (String) it2.next();

            if(!e1.equals(e2)){
                return false;
            }
        }

        return true;
    }

}
