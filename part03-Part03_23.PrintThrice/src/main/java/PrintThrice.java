
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a word:");
        
        String sweet = scanner.nextLine();
        String tot = sweet + sweet + sweet;

        System.out.println(tot);

    }
}
