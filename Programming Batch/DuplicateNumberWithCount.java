import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberWithCount {
    public static void main(String[] args) {
        int[] array = { 10, 20, 25, 33, 55, 10, 25 };

        System.out.println("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        findDuplicatesWithCount(array);

        System.out.println(dupNoMap(array));
    }

    public static void findDuplicatesWithCount(int[] arr) {
        System.out.println("Duplicate numbers with count: ");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean alreadyPrinted = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if this number was already printed
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            // Print only if count > 1 and not already printed
            if (count > 1 && !alreadyPrinted) {
                System.out.println("Number: " + arr[i] + " - Count: " + count);
            }
        }
    }

    public static Map<Integer, Integer> dupNoMap(int[] arr) {

        HashMap<Integer, Integer> uniqueNo = new HashMap<>();
        for (int element : arr) {
            uniqueNo.put(element, uniqueNo.getOrDefault(element, 0) + 1);
        }

        HashMap<Integer, Integer> duplicate = new HashMap<>();
        for (int key : uniqueNo.keySet()) {
            if (uniqueNo.get(key) > 1) {
                duplicate.put(key, uniqueNo.get(key));

            }
        }
        return duplicate;
    }
}