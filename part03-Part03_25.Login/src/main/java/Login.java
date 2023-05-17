
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username1 = "alex";
        String username2 = "emma";
        String pasword1 = "sunshine";
        String pasword2 = "haskell";
        
        System.out.println("Enter username:");
        String answer = scanner.nextLine();
        
        System.out.println("Enter pasword:");
        String pasword = scanner.nextLine();
        
        if(answer.equals(username1) && pasword.equals(pasword1)){
            System.out.println("You have successfully logged in!");
        }
        else if(answer.equals(username2) && pasword.equals(pasword2)){
            System.out.println("You have successfully logged in!");
        }
        else{
            System.out.println("Incorrect username or password!");
        }

    }
}
