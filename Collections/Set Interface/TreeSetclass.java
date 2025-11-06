import java.util.*;

public class TreeSetclass {
    public static void main(String[] args) {

        // TreeSet is mainly used for uniqueness and sorting. 
        // i.e.., TreeSet doesn’t store duplicate data and also implements default natural sorting order.
        Set<String> names = new TreeSet<>();
        names.add("Suresh");
        names.add("Bhavesh");
        names.add("Naresh");
        names.add("Paresh");
        names.add("Vishnu");
        System.out.println(names);
    }
}
