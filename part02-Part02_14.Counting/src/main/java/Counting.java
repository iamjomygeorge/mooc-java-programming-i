
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        while(number >= 0){
            System.out.println(count);
            count++;
            number--;
        }
    }
}
