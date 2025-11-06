import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods{

    public static void main(String[] args) {
        System.out.println("Collection Methods");

        Collection<String> tal = new ArrayList<String>(Arrays.asList("Sinner", "Nashik", "Malegaon", "Trimbak"));
        tal.add("Igatpuri");
        System.out.println(tal);

        Collection<String> city = new ArrayList<>(Arrays.asList("Mumbai", "Nashik", "Pune", "Nanded"));
        city.add("Nagpur");
        System.out.println(city);

        Collection<String> state = new ArrayList<>(Arrays.asList("Maharashtra", "Telangana", "Gujrat", "Tamil Nadu"));
        state.add("Kerala");
        System.out.println(state);

        Collection<String> india = new ArrayList<>();
        india.addAll(tal);
        india.addAll(city);
        india.addAll(state);
        System.out.println(india);

        System.out.println(india.size());
        System.out.println(india.isEmpty());
        System.out.println(india.remove("Igatpuri"));
        System.out.println(india);
        System.out.println(india.removeAll(tal));
        System.out.println(india);
        city.clear();
        System.out.println("city: ??" + city);
        System.out.println(india.contains("Nashik"));
        System.out.println(india.containsAll(state));


        Iterator<String> iterate = india.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        Object[] arrofObj = india.toArray();
        System.out.println(Arrays.toString(arrofObj));

        // System.out.println(india);
    }
}