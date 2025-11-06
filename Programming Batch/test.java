public class test {
    public static void main(String[] args) {
        Object[] arr = {10, 20, "hi", "bye", true, false};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] instanceof String){
                System.out.println(arr[i]);
            }
        }
    }
}
// import java.util.*;

// public class Example1 
// {
//     public static void main(String[] args) 
//     {

//         String sentence = "today we are learning java again java is a pl we again";

//         System.out.println(unique(sentence));

        
//     }

//     public static Set unique(String sentence)
//     {
//         String[] words = sentence.split("\\s+");

//         LinkedHashSet<String> unique = new LinkedHashSet<>();

//         for (String str : words) 
//         {
//             unique.add(str);   
//         }

//         return unique;
        
//     }
    
// }



// ------------------------------------
// import java.util.*;

// public class Example2 
// {
//     public static void main(String[] args) 
//     {
//         Queue<Integer> least = new PriorityQueue<>();
        
//         least.add(50);
//         least.add(9);
//         least.add(100);
//         least.add(-5);
//         least.add(10);

//         System.out.println(least.peek());
//         System.out.println(least.poll());
//         System.out.println(least.peek());
        
//     }
    
// }




// import java.util.*;

// public class Example3 
// {
//     public static void main(String[] args) 
//     {
//         Queue<Integer> least = new PriorityQueue<>(Collections.reverseOrder());
        
//         least.add(50);
//         least.add(9);
//         least.add(100);
//         least.add(-5);
//         least.add(10);

//         System.out.println(least.peek());//100
//         System.out.println(least.poll());
//         System.out.println(least.peek());
        
//     }
    
// }