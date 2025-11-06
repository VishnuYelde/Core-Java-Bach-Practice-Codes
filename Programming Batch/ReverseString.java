import java.util.*;

public class ReverseString {
    // public static String revString(String s){
    //     String rev = "";

    //     for(int i = s.length() -1; i >= 0; i--){
    //         rev = rev + s.charAt(i);
    //     }
    //     return rev;
    // }

    //! Using String Builder
    // public static String revString(String s){

    //     StringBuilder rev = new StringBuilder();
    //     for(int i = s.length() -1; i >= 0; i--){
    //         rev.append(s.charAt(i));
    //     }
    //     return rev.toString();
    // }


    //! Reverse String[]
    // public static String revString(String s){
    //     String[] str = s.split("");
    //     String[] rev = new String[str.length];
    //     for(int i = str.length -1, j = 0; i >= 0; i--, j++){
    //         rev[j] = str[i];
    //     }
    //     String finalstr = String.join("", rev);
    //     return finalstr;
    // }

    //! using collections -> list
    public static String[] revString(String[] s){
        List<String> liststr = Arrays.asList(s);
        Collections.reverse(liststr);

        String[] rev = liststr.toArray(new String[0]);
        return rev;
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a String: ");
        // String a = s.nextLine();
        // System.out.println("Reversed String is: " + revString(a));

        String[] words = {"one", "two", "three", "four", "five"};

        System.out.println("Original Array: " + Arrays.toString(words));
        System.out.println("Reversed Array: " + Arrays.toString(revString(words)));
    }
}
