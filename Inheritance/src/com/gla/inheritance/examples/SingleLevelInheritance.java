package com.gla.Inheritance.Examples;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleLevelInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Parent class method
        d.bark();  // Child class method
    }
}