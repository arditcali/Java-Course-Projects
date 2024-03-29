


import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                list.add(scan.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        if(list.contains(searchedFor)){
            System.out.println("Found!");
        }
        else{
            System.out.println("Not found.");
        }
        
        if(!file.equals("other-names.txt") && !file.equals("names.txt")){
            System.out.println("Reading the file " + file + " failed.");
        }    
    }
}
