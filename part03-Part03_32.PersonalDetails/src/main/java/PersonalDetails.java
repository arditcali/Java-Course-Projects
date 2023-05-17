
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        double sum = 0;
        int name = 0;
        int nr = 0;
        int temp = 0;
        String names = "";

        while(true){
            String people = scanner.nextLine();
            if(people.equals("")){
                break;
            }
            
            list.add(people);
            String[] piece = people.split(",");
            
            sum += Integer.valueOf(piece[1]);
            nr++;
            name = piece[0].length();
            
            if(temp < name){
                temp = name;
                names = piece[0];
            }
        }
        System.out.println("Longest name: " + names);
        System.out.println("Average of birth years: " + 1.0 * sum / nr);
    }         
}
    

