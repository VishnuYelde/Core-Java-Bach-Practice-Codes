import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEg {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 9, 45, 20, 15, 32));

        // Print Even no.
        list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println("Even no: " + n));

        // Find max no.
        int max = list.stream().max(Integer::compare).get();
        System.out.println("Max No: " + max);

        // Calculate the sum
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
    }

}
