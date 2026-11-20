
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        double squareRoot = Math.sqrt(numberOne + numberTwo);
        System.out.println((int)squareRoot);
    }
}
