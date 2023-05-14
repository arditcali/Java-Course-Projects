
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nr = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            
            if (x == 0) {
                break;
            }
            if (x > 0 || x < 0) {
                nr = nr + 1;
            }
            sum = sum + x;
        }
        System.out.println("Number of numbers: " + nr);
        System.out.println("Sum of the numbers: " + sum);

    }
    
}
