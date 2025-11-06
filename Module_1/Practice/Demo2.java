public class Demo2 {
    public static void main(String[] args) {
        int a=10, b=20;
        boolean result = (a++ > ++b)&&(++b > a++);
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);
    }
}
