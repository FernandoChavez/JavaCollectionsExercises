package org.fuerzadon.com.linkedlist.compare2listperindex;

import java.util.Iterator;
import java.util.LinkedList;

public class methods {

    public static <T> LinkedList<String> compareIndexList(LinkedList<T> lista1, LinkedList<T> lista2){

        LinkedList<String> resultado = new LinkedList<>();
        Iterator<T> it1 = lista1.iterator();
        Iterator<T> it2 = lista2.iterator();

        while(it1.hasNext() && it2.hasNext()){
            String v1= (String) it1.next();
            String v2= (String) it2.next();

            if(v1.equals(v2)){
                resultado.add("IGUAL");
            }else{
                resultado.add("DIFERENTE");
            }

        }
        return resultado;
    }
}
