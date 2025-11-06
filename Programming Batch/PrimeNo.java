public class PrimeNo {
    // most efficient way to check prime number
    public static boolean isPrime(int n){
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        if (n <= 3) return true; // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false; // eliminate multiples of 2 and 3

        for (int i = 5; i * i <= n; i += 6) { // check for factors from 5 to sqrt(n)
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 35; // Example input
        // Scanner s = new Scanner(System.in);
        // n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
            
        }
    }
}
