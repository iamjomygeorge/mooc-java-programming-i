
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        int count = 1;
        int factorial = 1;

        while(count <= number){
            factorial *= count;
            count++;
        }

        System.out.println("Factorial: " +factorial);
    }
}
