// package Inheritance;

// Inheritance means use of extends keyword by child class. 

//! Taking properties or methods from Parent class to child class using extends keywords is known as Inheritance. 
// Here we are doing method Overriding also;

public class Animal {
    
    void sleep(){
        System.out.println("Animal sleeping");

    }

    void sound(){
        System.out.println("anything");

    }
    public static void main(String[] args) {
        
        Cat c = new Cat();
        c.sound();
        c.eat();
        c.sleep();

        Animal a = new Animal();
        a.sleep();

        Dog d = new Dog();
        d.sound();
        d.sleep();

    }
}

class Cat extends Animal{
    void sleep(){
        System.out.println("Cat sleeping");
    }

    void sound(){
        System.out.println("Meow meow");

    }
    void eat(){
        System.out.println("Cat Eating");
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println("Dog Sleeping");

    }
    void sound(){
        System.out.println("Barks Bhaww bhaww");
    }
}

