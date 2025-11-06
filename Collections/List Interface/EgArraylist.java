import java.util.ArrayList;

public class EgArraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(50);
        a1.add(20);
        a1.add(10);
        a1.add(60);
        a1.add(80);
        a1.add(90);
        System.out.println(a1);


        ArrayList<Object> a2 = new ArrayList<>();

        a2.add("Java");
        a2.add("Tomato");
        a2.add(50);
        a2.add(true);
        a2.add("Mango");
        a2.add(70.51);
        System.out.println(a2);

        a2.addAll(a1);
        System.out.println(a2);


    }
    
}
