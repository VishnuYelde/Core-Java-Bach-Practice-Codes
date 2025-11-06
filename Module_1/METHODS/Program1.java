
public class Program1 {

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);
        add(50, 3000);

        System.out.println("Result : " + add(100, 200));
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
