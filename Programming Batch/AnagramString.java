import java.util.Scanner;

public class AnagramString {
    
    public static boolean Anagram(String a, String b){

        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()) return false;
        
        int[] freq = new int[26];

        for(int i = 0; i < a.length(); i++){
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if(count != 0) return false;
        }


        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // String a = s.nextLine();
        String a = "Anagram";
        // String b = s.nextLine();
        String b = "nagrama";
        s.close();

        if(Anagram(a, b)){
            System.out.println("Anagram Strings");
        }
        else{
            System.out.println("Not an Anagram");
        }

        System.out.println((Anagram(a, b)? "Anagram":"Not an Anagram"));
    }

}
