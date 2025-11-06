public class BubbleSort {
    public static int[] bubbleSort(int[] a){

        for(int i = 0; i < a.length -1; i++){
            boolean swapped = false;

            for(int j = 0; j < a.length -1; j++){
                if(a[j] > a[j+1]){

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22, 11, 90};   

        System.out.println("OG Array: ");
        for (int element : a) {
            System.out.print(element + " ");
        }

        int[] Sorted = bubbleSort(a);

        System.out.println("\nSorted Array: ");
        for (int element : Sorted) {
            System.out.print(element + " ");
        }
    }
}
