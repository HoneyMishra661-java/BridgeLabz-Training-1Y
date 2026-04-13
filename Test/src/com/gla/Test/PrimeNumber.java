package com.gla.Test;

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        System.out.println("Enter Your number");
        int a = sc.nextInt();
        if ( a == 0) {
            System.out.println("Enter Valid Number");
            return;
        }
        else if (a == 1 ) {
            System.out.println("Prime Number");
            return;
        }
        for ( int i = 2 ; i < a ; i++){
            if ( a % i == 0 && i != a){
                count++ ;
            }
        }
        if ( count > 0 ){
            System.out.println("Not Prime number");
        }
        else {
            System.out.printf("Prime Number");
        }
    }
}
