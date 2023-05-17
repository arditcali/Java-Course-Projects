
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int nam = 0;
        String name = "";
        
        while(true){
            String nameAge = scanner.nextLine();
            if(nameAge.equals("")){
                break;
            }
            String[] nr = nameAge.split(",");
            age = Integer.valueOf(nr[1]);
            
            while(age > nam){
                nam++;
                name = nr[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
