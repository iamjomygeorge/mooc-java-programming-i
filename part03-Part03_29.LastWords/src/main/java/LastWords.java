
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] values = value.split(" ");
            int valuesLength = values.length;
            System.out.println(values[valuesLength-1]);
        }
    }
}
