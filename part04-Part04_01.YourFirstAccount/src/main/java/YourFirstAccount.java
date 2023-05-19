
public class YourFirstAccount {
    
    public static void main(String[] args){
        Account firstAccount = new Account("Ron", 100);

        firstAccount.deposit(20);
        System.out.println(firstAccount);
    
    }        
}
