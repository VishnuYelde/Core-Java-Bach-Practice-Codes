public class StrongNo {
    
    public static int Fact(int n){
        int fact = 1;
        for(int  i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static boolean StrongNumber(int n){

        int sum = 0;
        int og = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + Fact(rem);
            n /= 10;
        }
        return og == sum;
    }
    public static void main(String[] args) {
        int n = 145;
        
        System.out.println((StrongNumber(n)? "Strong number":"Not a Strong number"));
    }
}
