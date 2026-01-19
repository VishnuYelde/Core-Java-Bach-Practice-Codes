public class DuplicateNumber {
    public static void main(String[] args) {
        int[] array = {10, 20, 25, 33, 55, 10, 25};
        
        System.out.println("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        findDuplicatesWithCount(array);
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
}