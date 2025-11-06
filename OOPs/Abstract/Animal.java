// package Abstract;

// Abstract:

abstract class Animal{
    abstract void sleep();
    abstract void sound();

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sleep();
        a.sound();
        Dog d = (Dog) a;
        d.add();
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println("Dog sleeping");
    }
    void sound(){
        System.out.println("Dog Barks");
    }
    void add(){
        System.out.println(4+5);
    }
    
}
    


