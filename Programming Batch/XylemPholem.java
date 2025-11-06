import java.util.ArrayList;

public class XylemPholem {
    
    public static boolean XylemOrPholem(int n){

        ArrayList<Integer> a = new ArrayList<>();
        while (n > 0) {
            a.add(0, n % 10);
            n /= 10;
        }

        int outerSum = a.getFirst() + a.getLast();
        int innerSum = 0;

        for(int i = 1; i < a.size() -1; i++){
            innerSum += a.get(i);
        }

        return outerSum == innerSum;
    }
    
    public static void main(String[] args) {
        int n = 62163;
        
        System.out.println((XylemOrPholem(n)? "Xylem number":"Pholem number"));
    }

}
