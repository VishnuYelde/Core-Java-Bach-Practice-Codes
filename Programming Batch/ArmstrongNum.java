public class ArmstrongNum {
    
    // 153 -> 1^3=1 + 5^3=125 + 3^3=27 = 153 (number == output num) //! count num = power of each digit

    public static int Count(int n){
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean ArmstrongNo(int n){

        int og = n;
        int count = Count(n);
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + Power(rem, count);
            n /= 10;
        }
        return og == sum;
    }

    public static int Power(int rem, int count){

        int pow = 1;
        for(int i = 1; i <= count; i++){
            pow = pow * rem;
        }
        return pow;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println((ArmstrongNo(n)? "Armstrong number":"Not an Armstrong number"));
    }

    
}
