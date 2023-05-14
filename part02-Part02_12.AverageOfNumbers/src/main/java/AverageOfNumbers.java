
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nr = 0;
        int tot = 0;
        double av = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            
            if (x == 0) {
                break;
            }
            if (x < 0 || x > 0) {
                nr = nr + x;
            }
            if (x < 0 || x > 0) {
                tot = tot + 1;
            }
            av = nr / tot;
            
        }
        System.out.println("Average of the numbers: " + av);

    }
    
}
