import java.util.*;

public class LinkedHSet {
    public static void main(String[] args) {

        
        // LinkedHashSet is just like HashSet but it maintains insertion order.

        Set<String> colors = new LinkedHashSet<>();
        colors.add("Red");
        colors.add("Voilet");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add(null);
        colors.add(null);
        colors.add("Red");
        System.out.println(colors);
    }
}
