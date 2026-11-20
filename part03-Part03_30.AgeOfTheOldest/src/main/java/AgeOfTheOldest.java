
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfTheOldest = 0;
        while(true){
            String nameAndAge = scanner.nextLine();
            if(nameAndAge.equals("")){
                break;
            }
            String[] splitedValue = nameAndAge.split(",");
            int age = Integer.valueOf(splitedValue[1]);
            if(age > ageOfTheOldest){
                ageOfTheOldest = age;
            }
        }
        System.out.println("Age of the oldest: " +ageOfTheOldest);
    }
}
