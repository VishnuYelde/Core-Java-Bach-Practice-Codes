public class ArrayEx1 {

    public static void main(String[] args) {
        int[] arr = {10, 40, -30, 50, 100};

        System.out.println(arr[1]);
        System.out.println(arr[3]);

        // Re-assign data
        arr[2] = 500;
        System.out.println("New Data Updated:" + arr[2]);

        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr[5]: " + arr[5]);
    }
}