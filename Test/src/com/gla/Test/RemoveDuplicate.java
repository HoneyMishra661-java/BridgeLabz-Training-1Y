package com.gla.Test;
import java.util.*;
public class RemoveDuplicate {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(88);
        list.add(77);
        list.add(25);
        list.add(25);
        list.add(69);
        System.out.println("List before removing duplicate");
        System.out.println(list);
        HashSet<Integer> set = new HashSet<>();
        for ( int i = 0 ; i < list.size() ; i++){
            set.add(list.get(i));
        }
        System.out.printf("List after removing duplicates");
        System.out.println(set);
    }
}
