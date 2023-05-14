
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int b = Integer.valueOf(scanner.nextLine());
        
        for (int x = b; x <= 100; x++) {
            System.out.println(x);
        }

    }
}
//Write a program, which reads an integer from the user. 
//Then the program prints numbers from that number to 100.