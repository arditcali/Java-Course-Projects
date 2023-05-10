
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number1 = Integer.valueOf(scan.next());
        if (number1 % 2 == 0) {
            System.out.println("Number " + number1 + " is even.");
        }else {
            System.out.println("Number " + number1 + " is odd.");
        }
    }
}
