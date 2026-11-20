
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while(number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while(number > 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int sizeValue = size;
        for(int i=1; i<=size; i++){
            printSpaces(sizeValue - 1);
            sizeValue--;
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int heightValue = height;
        for(int i=1; i<=height; i++){
            printSpaces(heightValue-1);
            heightValue--;
            printStars((2*i)-1);
        }
        for(int i=1; i<=2; i++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
