package com.gla.Inheritance.Examples;
interface A {
    void showA();
}
interface B {
    void showB();
}
class C implements A , B {
    public void showA(){
        System.out.println("Method of A");
    }
    public void showB(){
        System.out.println("Method of B");
    }
}
class D extends C {
    void showD(){
        System.out.println("Method of D");
    }
}
public class Hybrid {
    public static void main (String[] args){
        D obj = new D() ;
        obj.showA();
        obj.showB();
        obj.showD();
    }
}