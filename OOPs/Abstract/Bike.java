// package Abstract;

public abstract class Bike {
    abstract void start();
    public static void main(String[] args) {
        Bike b = new Bullet();
        b.start();

        // scooty object
        Bike s = new scooty();
        s.start();
    }
}
class Bullet extends Bike{
    void start(){
        System.out.println("Kick start");
    }
    
}
class scooty extends Bike{
    void start(){
        System.out.println("Self Start");
    }
}
