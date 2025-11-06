import java.util.ArrayList;

public class goa {
    public static void main(String[] args) {
        
        ArrayList<Object> a1 = new ArrayList<>();
        a1.add("Club");
        a1.add(25);
        a1.add(85.20);
        a1.add(true);
        a1.add(7485296354l);
        a1.add(60);


        System.out.println("Size of a1 Object is " + a1.size());
        System.out.println(a1);

        for (Object object : a1) {
            System.out.println(object);
        }
        
        System.out.println(a1.contains("Club"));
        System.out.println(a1.contains(25));
        System.out.println(a1.contains("Beer"));

        a1.remove(5);
        System.out.println(a1);

        System.out.println(a1.isEmpty());

        a1.clear();
        System.out.println(a1);
        System.out.println(a1.isEmpty());

        a1.add("Beach");
        System.out.println(a1);
    }
}
