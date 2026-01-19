public class SortingData {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 45, 20, 15, 32 };
        String[] sarr = { "Banana", "Apple", "Mango", "Grapes", "Chikoo", "Orange" };

        sortInteger(arr);
        sortString(sarr);

    }

    public static void sortInteger(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortString(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
