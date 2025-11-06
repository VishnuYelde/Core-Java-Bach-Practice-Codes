public class NoOfDigits {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println("Number of digits in " + number + ": " + countDigits(number));

    }


    // most optimal way to count the number of digits in an integer
    public static int countDigits(int number) {
        if (number == 0) return 1; // Special case for 0
        int count = 0;
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;
        }
        return count;
    }
}
