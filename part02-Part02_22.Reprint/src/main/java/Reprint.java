
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        int x = Integer.valueOf(scanner.nextLine());
        int y = 0;
        
        while (y < x) {
            y++;
            printText();
        }
    }
 
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
