
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int a = 0; a < number; a++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int b = 0; b < number; b++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int c = 1; c <= size; c++){
            printSpaces(size - c);
            printStars(c);
        }
    }

    public static void christmasTree(int height) {
        for (int d = 1; d <= height; d++){
            printSpaces(height - d);
            printStars(2 * d - 1);
        }
        for (int d = 1; d < 3; d++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
