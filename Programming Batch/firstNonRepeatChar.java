public class firstNonRepeatChar {
    public static void main(String[] args) {
        String str = "animal";

        System.out.println(FirstNonRepCh(str));
    }

    public static Character FirstNonRepCh(String str) {

        for (int i = 0; i < str.length(); i++) {

            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return str.charAt(i);
            }
        }

        return null;
    }
}
