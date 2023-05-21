
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        System.out.println("Enter numbers:");
        while(true){
            int nr = Integer.valueOf(scanner.nextLine());
            
            if(nr == -1){
                break;
            }
            
            if(nr % 2 == 0){
                even.addNumber(nr);
            }else{
                odd.addNumber(nr);
            }
            
            sum.addNumber(nr);
        }
        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
