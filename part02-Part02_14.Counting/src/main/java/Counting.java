import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = 0;
        int b = Integer.valueOf(scanner.nextLine());
        
        for (int x = a; x <= b; x++) {
            System.out.println(x);
        }
    }
}
