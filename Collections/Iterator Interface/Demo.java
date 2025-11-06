import java.util.*;

public class Demo {
    public static void main(String[] args) {
        
        List<String> li = new ArrayList<>(Arrays.asList("Mumbai", "Nashik", "Thane", "Pune", "Nanded"));
        // System.out.println(li);

        //! Iterator is an interface present in java.util package it is used to iterate any collection like Set , List and Queue.

        // Not having Index, and iterate only in forward direction.
        Iterator<String> It = li.iterator();
        while (It.hasNext()) {
            String city = It.next();
            System.out.println(city);

            if(city == "Pune"){
                It.remove();
            }
        }
        System.out.println(li);

        // ----------------------------------------------------------

        //! ListIterator Interface
        //? It only iterate 'List' but Not 'Set' and 'Queue'.
        //! iterate in both Forward, Backward direction.

        List<String> l1 = new ArrayList<>(Arrays.asList("Mouse", "CPU", "Monitor", "Keyboard", "Laptop"));
        System.out.println(li);

        ListIterator<String> itr = l1.listIterator();

        // forward iterate
        while (itr.hasNext()) {
            String thing = itr.next();
            System.out.println(thing);
        }


        List<String> s1 = new ArrayList<>();

        // backward iterate
        System.out.println("Backward Iteration: ");
        while (itr.hasPrevious()) {
            s1.add(itr.previous());
            // System.out.println(itr.previous());
        }
        System.out.println(s1);
    }    
}
