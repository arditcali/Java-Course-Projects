
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nr = 0;
        int tot = 0;
        double av = 0;
        int aa = 0;
        
        while (true) {
            int x = Integer.valueOf(scanner.nextLine());
            
            if (x == 0) {
                break;
            }
            if (x > 0) {
                tot = tot + 1;
            }
            if (x > 0) {
                nr = nr + x;
            }
            if (x <= 0) {
                aa = x;
            } 
            av = nr / tot;
        }
        if (aa <= 0 && av <= 0) {
            System.out.println("Cannot calculate the average");
        }
        if (av > 0){
            System.out.println(av);
        }
    }
    
}
