package com.gla.Generic;
public class GenericMethod {
    public static <T> void fibo(T n){
        int num = Integer.parseInt(n.toString());
        int a = 0 , b = 1 ;
        System.out.println(a +"\n" +b);
        for ( int i = 2 ; i < num ; i++){
            int sum = a + b ;
            System.out.println( sum);
            a = b ;
            b = sum ;
        }
    }
    public static <T extends Number> void fiboo(T n){
        int sums = n.intValue();
        int a = 0 , b = 1 ;
        System.out.println(a +"\n" +b);
        for ( int i = 2 ; i < sums ; i++){
            int sum = a + b ;
            System.out.println(sum);
            a = b ;
            b = sum ;
        }
    }
    public static void main (String[] args){
        fibo(5);
        System.out.println("\n");
//        fiboo("7");
        fiboo(8);
    }
}
