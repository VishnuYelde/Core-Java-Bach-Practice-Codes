public class MostFrequentChar {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 21, 2, 2, 3, 53, 2, 36, 14, 4, 4, 3, 2, 4 };
        String str = "programming";

        System.out.println(mostFreqChar(str));
    }

    public static Character mostFreqChar(String str) {
        int[] freq = new int[256];
        // count the frequency of each char
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = ' ';
        int maxCount = 0;

        // Find the char with max count/freq
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        return maxChar;
    }
}
