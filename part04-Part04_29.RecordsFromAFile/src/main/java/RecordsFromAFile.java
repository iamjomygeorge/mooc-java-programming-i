import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String nameOfTheFile = scanner.nextLine();
        scanner.close();

        try(Scanner fileScanner = new Scanner(Paths.get(nameOfTheFile))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if(Integer.valueOf(parts[1]) > 1){
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }else{
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
