import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dupno {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 25, 33, 55, 10, 25 };

        System.out.println(dupNo(arr));
    }

    public static Set<Integer> dupNo(int[] arr) {

        // empty set, only unique element will be added
        HashSet<Integer> set = new HashSet<>();

        // duplicate element will be added - LinkedHashSet maintains insertion order
        LinkedHashSet<Integer> dupHashSet = new LinkedHashSet<>();

        for (int num : arr) {
            if (!set.add(num)) { // same element not added, only unique element is added
                dupHashSet.add(num); // duplicate element is added
            }
        }
        return dupHashSet;
    }
}
