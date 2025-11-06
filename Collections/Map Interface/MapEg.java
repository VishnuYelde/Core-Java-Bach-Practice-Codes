import java.util.*;
import java.util.Map.Entry;


public class MapEg {
    public static void main(String[] args) {
        
        Map<Integer, String> ind = new HashMap<>();
        ind.put(1, "KL Rahul");
        ind.put(45, "Rohit");
        ind.put(18, "Virat");
        ind.put(7, "Dhoni");
        ind.put(10, "Sachin");
        System.out.println(ind.get(45));
        System.out.println(ind);

        Map<Integer, String> aus = new HashMap<>(Map.of(8, "Warner", 5, "MaxWell"));
        aus.put(3, "Starc");

        Map<Integer, String> ipl = new HashMap<>();
        ipl.putAll(ind);
        ipl.putAll(aus);
        System.out.println(ipl);

        ipl.remove(3);
        System.out.println(ipl.size());
        System.out.println(ipl.isEmpty());
        System.out.println(ipl.keySet());
        System.out.println(ipl.containsKey(45));
        System.out.println(ipl.containsValue("Virat"));
        System.out.println(ipl.get(1));


        System.out.println("Iterating Map using Set(Both key, value): entrySet()");
        Set<Entry<Integer, String>> s1 = ipl.entrySet();
        for(Entry<Integer, String> item: s1){

            Integer key = item.getKey();
            String val = item.getValue();
            System.out.println(key + " " + val);
        }

        System.out.println("Iterating Map using Set(only key): keySet()");
        Set<Integer> s2 = ipl.keySet();
        for (Integer i : s2) {
            System.out.println("Key: " + i);
        }

        System.out.println("Iterating Map using Collection(only Values): values()");
        Collection<String> s3 = ipl.values();
        for (String i : s3) {
            System.out.println("Value: " + i);
        }
    }
}
