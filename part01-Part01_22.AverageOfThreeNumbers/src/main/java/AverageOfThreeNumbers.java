
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int a = Integer.valueOf(scanner.nextLine());
        
        double c = 1.0 * (x + y + a) / 3;
        
        System.out.println("The average is " + c);

    }
}
