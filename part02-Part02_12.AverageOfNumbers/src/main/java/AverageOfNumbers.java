
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        double average = 0;
        int numberOfNumbers = 0;

        while(true){
            System.out.println("Give a number:");
            number = scanner.nextInt();

            if(number != 0){
                numberOfNumbers++;
                sum += number;
            }else{
                System.out.println("Average of the numbers: "+(double)sum/numberOfNumbers);
                break;
            }
        }
    }
}
