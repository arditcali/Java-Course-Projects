
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println("Search for?");
        int x = Integer.valueOf(scanner.nextLine());
        
        for(int index = 0; index < list.size(); index++){
            if(x == list.get(index)){
                System.out.println(x + " is at index " + index);
            }
        }
    }
}
