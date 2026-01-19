import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(10, 2, 30, 25, 12, 2, 46, 40));
        Set<Integer> s1 = new HashSet<>(a1);
        System.out.println(s1);
    }
}
