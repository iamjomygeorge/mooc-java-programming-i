
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int lastNumber = scanner.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= lastNumber){
            sum += i;
            i++;
        }
        System.out.println("Sum is "+sum);
    }
}
