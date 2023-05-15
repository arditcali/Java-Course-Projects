
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(3);

    }
    
    public static void printUntilNumber(int number) {
        int x = 0;
        
        while (x < number) {
            x++;
            System.out.println(x);
        }
    }

}
