
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int searchItem = scanner.nextInt();

        for(int i=0; i<list.size(); i++){
            int currentItem = list.get(i);
            if(searchItem == currentItem){
                System.out.println(searchItem+" is at index "+i);
            }
        }
    }
}
