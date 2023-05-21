
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(Paths.get("data.txt"))){
            while(true){
                String line = scan.nextLine();
                System.out.println(line);
            }
    
        }catch(Exception a){
        }
    }
}
