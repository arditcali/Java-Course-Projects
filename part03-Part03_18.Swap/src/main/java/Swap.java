import java.util.ArrayList;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        int length = 0;
        int largest = 0;
        double sum = 0;
        int nrs = 0;
        int age = 0;
        
        while(true){
            String input = scan.nextLine();
            if(input.equals("")){
                break;
            }
            String[] array = input.split(",");
            age = Integer.valueOf(array[1]);
            
            length = array[0].length();
            
            if(largest < length){
                largest = length;
                name = array[0];
            }
            
            for(int i = 0; i < array.length; i++){
                sum += age;
                nrs++;
            }
            
        }
        System.out.println("Average of years: " + sum / nrs);
        System.out.println("Longest name: " + name);
    }
}