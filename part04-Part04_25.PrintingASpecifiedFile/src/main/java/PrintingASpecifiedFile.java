
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        
        System.out.println("Which file should have its contents printed?");
        
        try(Scanner scan = new Scanner(Paths.get(text()));){
            while(scan.hasNextLine()){
                String a = scan.nextLine();
                System.out.println(a);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static String text(){
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        return txt;
    }
}
