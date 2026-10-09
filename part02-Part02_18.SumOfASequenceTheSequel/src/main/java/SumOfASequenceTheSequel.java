
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("First number? ");
        int firstNumber = scanner.nextInt();
        System.out.print("Last number? ");
        int secondNumber = scanner.nextInt();

        while(firstNumber <= secondNumber){
            sum += firstNumber;
            firstNumber++;
        }
        System.out.println("The sum is "+sum);
    }
}
