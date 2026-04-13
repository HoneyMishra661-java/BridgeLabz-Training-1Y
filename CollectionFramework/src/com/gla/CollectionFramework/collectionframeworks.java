package com.gla.CollectionFramework;

import java.util.*;
public class collectionframeworks {
    public static void main (String[] args){
        List l = new ArrayList();
        List l2  = new LinkedList();
        List l3 = new Vector();
        List l4 = new Stack();
        l.add(10);
        l.add(2.4);
        l.add("Honey");
        System.out.println(l);
        for ( int i = 0 ; i <l.size() ;i++){
            System.out.println(l.get(i));
        }
        for ( Object i : l){
            System.out.println(i);
        }
        l.remove(2);
        System.out.println(l.isEmpty());
        System.out.println(l.contains(2.4));
        System.out.println(l);
    }
}