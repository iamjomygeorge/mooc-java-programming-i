
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value);

        while(value < 100){
            value++;
            System.out.println(value);
        }
    }
}
