import java.util.ArrayList;

public class HeterogenousAList {
    public static void main(String[] args) {
        
        ArrayList<Object> a1 = new ArrayList<>();

        a1.add(81);
        a1.add("Vishnu");
        a1.add(true);
        a1.add("Welcome to ArrayList example");
        a1.add(25.60);
        a1.add(false);
        System.out.println("ArrayList: "+a1+"\n=================================================================");

        System.out.println(a1.contains(81));
        System.out.println(a1.indexOf(81));
        System.out.println(a1.isEmpty());
        System.out.println("SIZE: "+ a1.size());
        System.out.println(a1.contains("Vishnu"));

        a1.remove(false);
        System.out.println(a1);

        ArrayList<Object> a2 = new ArrayList<>();
        a2.add("Tomato");
        a2.add(50);
        a2.add("Java");
        a2.add(true);
        a2.add("Mango");
        System.out.println(a2);

        a2.addAll(0, a1);
        System.out.println(a2);
        System.out.println(a2.containsAll(a1));

        a2.clear();
        System.out.println(a2);

    }
}
