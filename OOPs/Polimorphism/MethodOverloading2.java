
public class MethodOverloading2 {

    public static void main(String[] args) {
        System.out.println(add('a', 'b'));

    }

    public static double add(int a, int b) {
        System.out.println("1");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2");
        return a + b;
    }

    public static double add(int a, double b) {
        System.out.println("3");
        return a + b;
    }

    public static double add(double a, int b) {
        System.out.println("4");
        return a + b;
    }
}
