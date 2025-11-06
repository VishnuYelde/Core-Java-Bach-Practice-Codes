import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
        Set<String> colorset = new HashSet<>(Set.of("Orange", "Blue", "White", "Black"));
        colorset.add("Red");
        colorset.add(null);
        colorset.add("Yellow");
        colorset.add(null);

        System.out.println(colorset);
        colorset.remove(null);
        System.out.println(colorset);


        //Sort the color set by alphabetically order
        SortedSet<String> sortcolor = new TreeSet<>(colorset);
        System.out.println(sortcolor);
    }
}
