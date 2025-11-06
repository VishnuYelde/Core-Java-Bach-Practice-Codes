public class SquareRoot {
    public static void main(String[] args) {
        double n = 49; 
        System.out.println("Square root of " + n + " is: " + squareRoot(n));
    }
    

    
    // time complexity O(log n) most efficient way to find square root
    public static double squareRoot(double n){
        double temp;
        double sqrt = n / 2.0; // Initial guess for the square root
        do {
            temp = sqrt;
            sqrt = (temp + (n / temp)) / 2.0; // Average of guess and n divided by guess

        }
        while ((temp - sqrt != 0.0)); // Continue until the guess stabilizes
        return sqrt; 
    }
}