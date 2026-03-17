public class zeroShiftingLast {
    public static void main(String[] args) {
        int[] a = { 12, 0, 23, 0, 90, 89, 0, 8, 0, 45, 65, 0, 23, 5 };

        zeroShifted(a);
        // zeroshift(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void zeroShifted(int[] arr) {

        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        while (position < arr.length) {
            arr[position] = 0;
            position++;
        }
    }

    // simple & swap
    public static void zeroshift(int[] arr) {
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
                position++;
            }
        }
    }
}
