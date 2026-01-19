public class MinMaxArray {

    public static void main(String[] args) {
        int[] arr = { 102, 5, 7, 98, 2, 45, 32 };
        findMinMax(arr);
    }

    // most efficient way to find min and max in a single pass
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array must not be null or empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}