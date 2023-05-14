
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numbers = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        
        while(true) {
            int nr = Integer.valueOf(scanner.nextLine());
            
            if(nr == -1) {
                break;
            }
            if(nr > 0) {
                numbers++;
            }
            if(nr % 2 == 0) {
                even++;
            } else{
                odd++;
            }
            sum += nr;
            avg = 1.0 * sum / numbers;
        }
        System.out.println("Thx!Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
