public class VairableArgument2 {

    public static void jadoo(String s, char c, int... n){

        System.out.println(s);
        System.out.println(c);
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        jadoo("Rohit", 'f', 20, 50, 45, 74);
        System.out.println("-------------------");
        jadoo("Yash", 'G', 25, 40, 15);
        System.out.println("-------------------");
    }


}
