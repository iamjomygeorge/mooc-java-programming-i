
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] values = input.split(" ");
            for(int i=0; i<values.length; i++){
                String currentValue = values[i];
                if(currentValue.contains("av")){
                    System.out.println(currentValue);
                }
            }
        }
    }
}
