
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int nr = Integer.valueOf(scanner.nextLine());
        int sum = 1;
        
        for(int a = 1; a <= nr; a++) {
            sum = sum * a;
        }
        System.out.println(sum);
    }
}
