import java.util.ArrayList;

public class Statistics {
    private double passedStudentsCounter;

    public Statistics(ArrayList<Integer> points) {
        for (Integer point : points) {
            if (point >= 50) {
                passedStudentsCounter ++;
            }
        }
    }

    public void printPointAverage(ArrayList<Integer> points) {
        double sum = 0;
        for (Integer point : points) {
            sum += point;
        }

        System.out.println("Point average (all): " + sum / points.size());
    }

    public void printPassingGradePointAverage(ArrayList<Integer> points) {
        double sum = 0;
        for (Integer point : points) {
            if (point >= 50) {
                sum += point;
            }
        }

        if (passedStudentsCounter != 0) {
            System.out.println("Point average (passing): " + sum / passedStudentsCounter);
        } else {
            System.out.println("Point average (passing): " + "-");
        }
    }

    public void printPassPercentage(ArrayList<Integer> points) {
        System.out.println("Pass percentage: " + (passedStudentsCounter / points.size()) * 100);
    }

    public void printGradeDistribution(ArrayList<Integer> points) {
        System.out.println("Grade distribution:");

        System.out.print("5: ");
        for (Integer point : points) {
            if (point >= 90) {
                System.out.print("*");
            }
        }

        System.out.println();
        System.out.print("4: ");
        for (Integer point : points) {
            if (point < 90 && point >= 80) {
                System.out.print("*");
            }
        }

        System.out.println();
        System.out.print("3: ");
        for (Integer point : points) {
            if (point < 80 && point >= 70) {
                System.out.print("*");
            }
        }

        System.out.println();
        System.out.print("2: ");
        for (Integer point : points) {
            if (point < 70 && point >= 60) {
                System.out.print("*");
            }
        }

        System.out.println();
        System.out.print("1: ");
        for (Integer point : points) {
            if (point < 60 && point >= 50) {
                System.out.print("*");
            }
        }

        System.out.println();
        System.out.print("0: ");
        for (Integer point : points) {
            if (point < 50) {
                System.out.print("*");
            }
        }

        System.out.println();
    }
}
