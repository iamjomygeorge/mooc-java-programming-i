
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                list.add(line);
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }

        boolean found = false;
        for(String line: list){
            if(line.contains(searchedFor)){
                found = true;
            }
        }

        if(found){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
    }
}
