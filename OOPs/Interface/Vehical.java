// package Interface;

public interface Vehical {
    default void start() {          // has body
        System.out.println("Starting..."); 
    } 

    // abstract method
    void move();
    int airBag(int a, int b);

    static int wheels() {           // call: Vehical.wheels()
        return 4; 
    }


    public static void main(String[] args) {

        Car c = new Car();
        c.move();
        c.start();

        System.out.println(Vehical.wheels());
        System.out.println(c.airBag(6,4));

    }
}

class Car implements Vehical {
    public void move() { 
        System.out.println("Car moving"); 
    }

    // Vehical add = (a, b) -> a+b;
    public int airBag(int a, int b){
        return a + b;
    }

}



