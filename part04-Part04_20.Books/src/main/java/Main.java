import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<book> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Title:");
            String title = scan.nextLine();
            if(title.isEmpty()){
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());

            System.out.println("Publication year:");
            int year = Integer.valueOf(scan.nextLine());
            
            list.add(new book(title, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String information = scan.nextLine();
        if(information.equals("everything")){
            for(book all : list){
                System.out.println(all);
            }
        }
        if(information.equals("name")){
            for(book all : list){
                System.out.println(all.title());
            }
        }
    }
}
