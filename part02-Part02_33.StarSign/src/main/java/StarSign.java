
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int x = 0;
        while (x < number) {
            x++;
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int y = 0;
        while (y < size){
            y++;
            printStars(size);
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        for (int a = 0; a < height; a++){
            printStars(width);
        } 
    }

    public static void printTriangle(int size) {
        for (int b = 0; b <= size; b++){
            printStars(b);
        }
    }
}
