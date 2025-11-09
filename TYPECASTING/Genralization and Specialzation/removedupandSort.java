import java.util.*;

public class removedupandSort {

    public static Set<String> removeDup(List<String> s) {      // if return type is list then convert to ArrayList
        Set<String> set1 = new TreeSet<>(s);
        // ArrayList<String> finalSet = new ArrayList<>(set1);  
        return set1;
    }

    public static void main(String[] args) {
        
        List<String> a = Arrays.asList("a", "b", "d", "r", "g", "a", "b", "a");
        System.out.println("Original List: " + a);
        System.out.println("Removed Duplicate List: " + removeDup(a));

    }
}
