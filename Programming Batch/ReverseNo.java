// most efficient way to reverse a number in Java

public class ReverseNo {
    public static void main(String[] args) {
        int n = 654321; 
        System.out.println("Reversed number of " + n + " is: " + reverseNumber(n));
    }

    // time complexity O(log n) most efficient way to reverse a number
    public static int reverseNumber(int n){
        int reversed = 0; 
        while (n!=0) {
            int digit = n % 10;                     // Get the last digit of n
            reversed = reversed * 10 + digit;       // Shift the current reversed number and add the last digit
            n = n/10;                               // Remove the last digit from n

            
        }
        return reversed; 
    }
}
