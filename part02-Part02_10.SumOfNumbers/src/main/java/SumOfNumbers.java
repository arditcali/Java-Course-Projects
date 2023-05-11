
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int y = Integer.valueOf(scanner.nextLine());
            
            if (y == 0) {
                break;    
            }
            x = x + y;
        
        }
        System.out.println("Sum of the numbers: " + x);

    }
    
}
