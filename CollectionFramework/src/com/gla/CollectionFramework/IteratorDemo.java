package com.gla.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
public class IteratorDemo {
    public static void main (String[]args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(55);
        list.add(88);
        Iterator<Integer> it = list.iterator();
        while ( it.hasNext()){
            System.out.println(it.next());
        }
    }
}
