public class FirstNonRepChar {

    public static char FirstNonRepCh(String str){
        for(int i = 0; i < str.length(); i++){

            boolean unique = true;
            for(int j = 0; j < str.length(); j++){

                if(i != j && str.charAt(i) == str.charAt(j)){
                    unique = false;
                    break;
                }
            }

            if(unique){
                return str.charAt(i);
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        String s = "aabbccddee";
        System.out.println(FirstNonRepCh(s));
    }
}