import java.util.*;

public class iterateList {
    public static void main(String[] args) {
        ArrayList<String> alphabets = new ArrayList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("E");
        System.out.println(alphabets.size());

        // Ieteration: Forward
        System.out.println("Iteration: Forward");
        for(int i = 0; i < alphabets.size(); i++){
            System.out.print(alphabets.get(i)+" ");
        }

        // "Iteration: Reverse"
        System.out.println("\nIteration: Reverse");
        for (int i = alphabets.size() -1; i >= 0; i--) {
            System.out.print(alphabets.get(i)+" ");
        }

        // Iterate using forEach(identifier variable_declaration: reference)
        System.out.println("\nForEach loop: ");
        for (String i : alphabets) {
            System.out.print(i+" ");
        }
    }
}
