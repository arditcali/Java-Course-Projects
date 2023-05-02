
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = "";
        text = scan.nextLine();
        
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double fnr = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean fact = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + fnr);
        System.out.println("You gave the boolean " + fact);

    }
}
