import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Spring", "JS"));

        list.sort((a, b) -> a.compareTo(b));
        System.out.println(list);
    }
}
