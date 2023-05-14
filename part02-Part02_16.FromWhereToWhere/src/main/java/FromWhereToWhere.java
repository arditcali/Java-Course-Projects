
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int x = Integer.valueOf(scanner.nextLine());;
        
        System.out.println("Where from?");
        int a = Integer.valueOf(scanner.nextLine());
        
        for (int y = a; y <= x; y++) {
            System.out.println(y);
        }
    }
}
