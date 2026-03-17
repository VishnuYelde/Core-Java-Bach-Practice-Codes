public class SecondLargestNumArray {
    public static void main(String[] args) {
        int arr[] = { 1, 20, 53, 84, 50, 22 };

        for (int i = 0; i < arr.length - i; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);
    }
}
