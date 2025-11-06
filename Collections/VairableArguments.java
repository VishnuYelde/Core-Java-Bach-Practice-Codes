public class VairableArguments {
    public static void sum(int... n){

        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println("Total Sum: " + sum);
    }

    public static void main(String[] args) {
        
        sum(51, 20, 60, 87, 65, 98);
        sum(65, 30, 40, 77);

    }
}
