
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 0;
        int sum = 0;
        double average = 0;

        while(true){
            number = scanner.nextInt();

            if(number == 0 && count == 0){
                System.out.println("Cannot calculate the average");
                break;
            }

            if(number == 0){
                System.out.println("Cannot calculate the average");
                System.out.println(average);
                break;
            }

            if(number > 0){
                sum += number;
                count++;
                average = (double) sum/count;
            }else if(number < 1){
                System.out.println("Cannot calculate the average");
            }
        }
    }
}
