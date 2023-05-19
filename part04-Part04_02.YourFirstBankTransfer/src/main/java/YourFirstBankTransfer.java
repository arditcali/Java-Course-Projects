
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account mathAccount = new Account("Matthews account", 1000.0);
        mathAccount.withdrawal(100.0);
        
        Account myAccount = new Account("My account", 0);
        myAccount.deposit(100.0);
        
        System.out.println(mathAccount);
        System.out.println(myAccount);
    }
}
