import java.util.*;

public class Merge2list {

    // Method to merge two lists in zigzag manner
    public static ArrayList<Integer> mergeZigZag(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Pick alternately from both lists
        while (i < list1.size() && j < list2.size()) {
            result.add(list1.get(i++));
            result.add(list2.get(j++));
        }

        // Add remaining elements (if any)
        while (i < list1.size()) {
            result.add(list1.get(i++));
        }
        while (j < list2.size()) {
            result.add(list2.get(j++));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 54, 62);
        List<Integer> list2 = Arrays.asList(2, 4, 6);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // List<Integer> merged = ;
        System.out.println("ZigZag Merged List: " + mergeZigZag(list1, list2));
    }

}
