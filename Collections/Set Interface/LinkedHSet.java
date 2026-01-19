import java.util.*;

public class LinkedHSet {
    public static void main(String[] args) {

        // LinkedHashSet is just like HashSet but it maintains insertion order.

        Set<String> colors = new LinkedHashSet<>();
        colors.add("Red");
        colors.add("Voilet");
        colors.add(null);
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        colors.add(null);
        System.out.println(colors);

        colors.remove(null);
        System.out.println(colors);

        // to sort linkedHashSet first remove the null values for TreeSet,
        // because it compares all the element and then sort all.
        SortedSet<String> sorting = new TreeSet<String>(colors);
        System.out.println(sorting);
    }
}
