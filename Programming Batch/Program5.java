public class Program5 {
    public static void main(String[] args) {
        // int a = 100;
        // char b = 'A';
        // double c = 100.0;
        // double result = ++a + ++b + b++ + c++ + a/b++ + --a + ++c + (int) a/b +(int) c;

        int a = 'z';
        char b = 'A';
        double c = 10.5;
        double result = ++a + --c + --a/--b + ++c + --c + (int) (++c/b++) + (int) c/a - --a*2;

        System.out.println("Result:" + result);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
