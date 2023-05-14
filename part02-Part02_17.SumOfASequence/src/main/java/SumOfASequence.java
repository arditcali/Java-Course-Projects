
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int nr = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for (int y = 0; y <= nr; y++) {
            sum += y;
        }
        System.out.println("The sum is " + sum);

    }
}
