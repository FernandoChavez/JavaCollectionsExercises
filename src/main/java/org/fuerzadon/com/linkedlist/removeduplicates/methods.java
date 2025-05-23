package org.fuerzadon.com.linkedlist.removeduplicates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class methods {

    public static Set<Integer> removeDuplicates (LinkedList<Integer> list){

        Set<Integer> unicos = new HashSet<>();

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            unicos.add(it.next());
        }

        return unicos;
    }
}
