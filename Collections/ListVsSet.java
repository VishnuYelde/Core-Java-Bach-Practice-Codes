import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args) {
        List<String> lst = new LinkedList<String>();
        lst.add("red");
        lst.add("yellow");
        lst.add("white");
        lst.add("red");
        lst.add(null);
        lst.add("orange");
        lst.add(null);
        System.out.println(lst);

        // no duplicates are allowed in set.
        Set<String> set = new HashSet<String>();
        set.add("red");
        set.add("yellow");
        set.add("white");
        set.add("red");     //duplicate
        set.add(null); 
        set.add("orange");
        set.add(null);      //duplicate
        System.out.println(set);
    }
}
