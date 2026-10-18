import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                list.add(line);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        int count = 0;
        for(String line: list){
            if(Integer.valueOf(line) >= lowerBound && Integer.valueOf(line) <= upperBound){
                count++;
            }
        }

        System.out.println("Numbers: " + count);
    }

}
