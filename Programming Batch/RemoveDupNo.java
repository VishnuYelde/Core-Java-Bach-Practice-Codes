import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDupNo {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 25, 33, 55, 10, 25 };

        System.out.println(Arrays.toString(removeDupNo(arr)));

    }

    public static int[] removeDupNo(int[] arr) {

        TreeSet<Integer> resultset = new TreeSet<>();
        for (Integer element : arr) {
            resultset.add(element);
        }

        int[] finalarr = new int[resultset.size()];
        int index = 0;
        for (int num : resultset) {
            finalarr[index++] = num;
        }

        return finalarr;
    }
}
