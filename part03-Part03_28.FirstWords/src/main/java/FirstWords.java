
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] splitValues = value.split(" ");
            System.out.println(splitValues[0]);
        }
    }
}
