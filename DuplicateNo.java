public class DuplicateNo {
    public static void main(String[] args) {
        int[] array = {10, 20, 25, 33, 55, 10, 25, 25};
        
        findDuplicatesWithCount(array);
    }
    
    public static void findDuplicatesWithCount(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean printed = false;
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }
            
            if (count > 1 && !printed) {
                System.out.println("No: " + arr[i] + " -> " + count);
            }
        }
    }
}