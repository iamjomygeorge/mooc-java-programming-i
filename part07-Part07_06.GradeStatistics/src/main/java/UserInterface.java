import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Integer> points;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        points = new ArrayList<Integer>();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 100) {
                points.add(input);
            }
        }

        Statistics statistics = new Statistics(points);
        statistics.printPointAverage(points);
        statistics.printPassingGradePointAverage(points);
        statistics.printPassPercentage(points);
        statistics.printGradeDistribution(points);
    }
}
