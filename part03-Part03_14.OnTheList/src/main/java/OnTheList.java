
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for? ");
        String searchElement = scanner.nextLine();
        if(list.contains(searchElement) == true){
            System.out.println(searchElement+ " was found!");
        }else{
            System.out.println(searchElement+ " was not found!");
        }
    }
}
