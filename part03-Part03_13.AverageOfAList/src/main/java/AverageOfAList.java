
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        double sum = 0;
        int numberOfNumbers = 0;
        double avg = 0;
        
        while(true){
            int nr = Integer.valueOf(scanner.nextLine());
            if(nr == -1){
                break;
            }
            list.add(nr);
        }
        for(int numbers: list){
            sum += numbers;
            numberOfNumbers++;
        }
        avg = 1.0 * sum / numberOfNumbers;
        System.out.println("Average: " + avg);
        
    }
}
