
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }else{
                String[] array = value.split(" ");
                for(int i=0; i<array.length; i++){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
