import java.util.*;

public class reverstringlist {
    public static ArrayList<String> reverseString(ArrayList<String> a){

        // System.out.println(a);

        // Sorting
        Collections.sort(a);
        System.out.println(a);

        // reverse order
        Collections.sort(a, Collections.reverseOrder());
        // System.out.println(a);



        return a;
    } 
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<String>(Arrays.asList("a", "x", "d", "y"));
        System.out.println(reverseString(s));
    }
}
