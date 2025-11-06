// package Interface;


// Functional interface (single abstract method)
//! Great for lambdas.


public class demo {
    public static void main(String[] args) {
        Protection add = (a, b) -> a + b;           // lambda ( -> )
        System.out.println(add.airbags(4, 3));
    }
}

interface Protection{
    int airbags(int a, int b);
}
