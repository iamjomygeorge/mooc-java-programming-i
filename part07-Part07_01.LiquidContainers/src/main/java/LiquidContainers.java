import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        final int min = 0;
        final int max = 100;
        int first = 0;
        int second = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);

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
                if (Integer.valueOf(parts[1]) < 0) {
                    number = 0;
                } else {
                    number = Integer.valueOf(parts[1]);
                }

                if (operation.equals("add")) {
                    first += number;

                    if (first > 100) {
                        first = 100;
                    }
                } else if (operation.equals("move")) {
                    if (number > first) {
                        number = first;
                    }

                    first = first - number;
                    second = second + number;

                    if (second > 100) {
                        second = 100;
                    }
                } else if (operation.equals("remove")) {
                    second -= number;

                    if (second < 0) {
                        second = 0;
                    }
                }
            }
        }
    }
}
