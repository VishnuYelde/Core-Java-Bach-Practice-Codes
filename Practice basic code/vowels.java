public class vowels {
    public static void main(String[] args) {
        String str = "VISHNU yelde";
        System.out.println("No. of vowels in the string: " + countVowels(str));

    }

    // the most optimal way to count vowels in a string is as follows:
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
