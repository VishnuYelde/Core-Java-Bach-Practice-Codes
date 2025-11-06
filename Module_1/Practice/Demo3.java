public class Demo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        char ch = 'a';
        
        int res = a++ + ++ch - --ch + ++a + --b - --b  * 5 / a-- + ++ch - --a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(res);
    }
}
