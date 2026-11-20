import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();
 
        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);
 
            String input = scan.nextLine();
            System.out.println();
            String[] parts = null;
            String operation = null;
            int number = 0;
 
            if (input.equals("quit")) {
                scan.close();
                break;
            } else {
                parts = input.split(" ");
                operation = parts[0];
                number = Integer.valueOf(parts[1]);
 
                if (operation.equals("add")) {
                    containerOne.add(number);
                } else if (operation.equals("move")) {
                    if (number > containerOne.contains()) {
                        number = containerOne.amountOfLiquid;
                    }
 
                    containerOne.amountOfLiquid = containerOne.contains() - number;
                    containerTwo.amountOfLiquid = containerTwo.contains() + number;
 
                    if (containerTwo.amountOfLiquid > 100) {
                        containerTwo.amountOfLiquid = 100;
                    }
                } else if (operation.equals("remove")) {
                    containerTwo.remove(number);
                }
            }
        }
    }
}
