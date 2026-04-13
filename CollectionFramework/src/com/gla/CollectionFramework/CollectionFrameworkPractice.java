package com.gla.CollectionFramework;
import java.util.*;
public class CollectionFrameworkPractice {
    public static void main (String[]args){
        ArrayList<Integer> a1 = new ArrayList<>();
        LinkedList<String> l1 = new LinkedList<>();
        Vector<Double> vector = new Vector<>();
        Stack<Boolean> stack = new Stack<>();
        a1.add(11);
        a1.add(22);
        a1.add(33);
        a1.add(44);
        System.out.println(a1);
        System.out.println("Now removing");
        a1.remove(1);
        System.out.println(a1);
    }
}