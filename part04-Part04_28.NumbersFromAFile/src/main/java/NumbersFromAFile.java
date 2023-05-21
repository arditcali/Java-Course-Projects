import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int nrs = 0;
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                list.add(scan.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        for(int i = 0; i < list.size(); i++){
            if(lowerBound <= Integer.valueOf(list.get(i)) && upperBound >= Integer.valueOf(list.get(i))){
                nrs++;
            }
        }
        
        System.out.println("Numbers: " + nrs);
    }

}
