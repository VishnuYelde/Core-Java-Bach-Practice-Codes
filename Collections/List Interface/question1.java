import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class question1 {
    public static void main(String[] args) {
        
        ArrayList<Object> a1 = new ArrayList<>(Arrays.asList(50, 45.25, true, false));
        a1.add("Vishnu");
        a1.add("Java");
        a1.add(90);
        a1.add(60);

        System.out.println("Original List: "+a1);

        //! Iteration of only Integer type of data
        for (Object object : a1) {
            if (object instanceof Integer) {
                System.out.println(object);
            }
        }

        //! Use an Iterator and call iterator.remove()
        // Iterator<Object> it = a1.iterator();
        // while (it.hasNext()) {
        //     Object ob = it.next();
        //     if (ob instanceof Integer) {
        //         it.remove();
        //     }
        // }
        // System.out.println("Modified List: "+a1);

        //! Use removeIf (Java 8+)
        // a1.removeIf(ob -> ob instanceof Integer);
        // System.out.println("Modified List: "+a1);




        ArrayList<Object> a2 = new ArrayList<>();

        for (Object object : a1) {
            if (object instanceof Integer) {
                a2.add(object);
            }
        }
        System.out.println("a1 elements added to a2, List -> a2: "+a2);
    }
}
