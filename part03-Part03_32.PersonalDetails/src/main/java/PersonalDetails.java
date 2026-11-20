
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String longestName = "";
        int sum = 0;
        while(true){
            String nameAndBirthYear = scanner.nextLine();
            if(nameAndBirthYear.equals("")){
                break;
            }
            String[] splittedStrings = nameAndBirthYear.split(",");
            counter++;
            sum += Integer.valueOf(splittedStrings[1]);
            int lengthOfLongestName = longestName.length();
            if(lengthOfLongestName < splittedStrings[0].length()){
                longestName = splittedStrings[0];
            }
        }
        System.out.println("Longest name: " +longestName);
        System.out.println("Average of the birth years: " + (double) sum/counter);
    }
}
