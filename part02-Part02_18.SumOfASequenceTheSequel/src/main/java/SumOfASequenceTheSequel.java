
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int nr1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Second number?");
        int nr2 = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for(int a = nr1; a <= nr2; a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
