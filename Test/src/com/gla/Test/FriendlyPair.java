package com.gla.Test;

public class FriendlyPair {
    public static void main (String[] args){
        int a = 6 ;
        int b = 28 ;
        int count1 = 0 ;
        int count2= 0 ;
        for (int i = 1 ; i < a ; i++){
            if ( a % i == 0 && i != a){
                count1+=i;
            }
        }
        for (int i = 1 ; i < b ; i++){
            if ( b % i == 0 && i != b ){
                count2+=i;
            }
        }
        if ( count1 / a == 1 && count2 / b == 1){
            System.out.printf("Friendly Pair");
        }
        else {
            System.out.println("Not friendly Pair");
        }
    }
}
