
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int value = scanner.nextInt();
        System.out.print("Where from? ");
        int number = scanner.nextInt();

        while(number <= value){
            System.out.println(number);
            number++;
        }
    }
}
