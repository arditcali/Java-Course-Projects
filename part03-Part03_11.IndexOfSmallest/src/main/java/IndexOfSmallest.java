
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int nr = 0;

        while(true){
            nr = Integer.valueOf(scanner.nextLine());
            if(nr == 9999){
                break;
            }
            list.add(nr);
        }
        int small = list.get(0);
        
        for(int i = 0; i < list.size(); i++){
            int x = list.get(i);
            if(small > x){
                small = x;
            }
        }
        System.out.println("Smallest number: " + small);
        
        for(int i = 0; i < list.size(); i++){
            if(small == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
    }
}