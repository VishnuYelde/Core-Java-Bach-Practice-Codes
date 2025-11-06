class Account{
    // Singleton Class
    private static Account object; // half object

    private Account(){
        System.out.println("Account Created Successfully...");
    }

    public static void CreateAccount(){
        if(object == null){
            object = new Account(); // half object + half object
        }
        else{
            System.out.println("Account Already exists...");
        }
    }
}
public class SingletonClass {

    public static void main(String[] args) {
        // Account a1 = new Account();
        Account.CreateAccount();
        Account.CreateAccount();
        Account.CreateAccount();
        
    }
    
}


