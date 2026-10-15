
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfTheOldest = 0;
        String nameOfTheOldest = "";
        while(true){
            String namesAndAges = scanner.nextLine();
            if(namesAndAges.equals("")){
                break;
            }
            String[] splittedValues = namesAndAges.split(",");
            if(Integer.valueOf(splittedValues[1]) > ageOfTheOldest){
                ageOfTheOldest = Integer.valueOf(splittedValues[1]);
                nameOfTheOldest = splittedValues[0];
            }
        }
        System.out.println("Name of the oldest: " +nameOfTheOldest);
    }
}
