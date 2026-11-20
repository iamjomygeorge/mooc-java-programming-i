import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if(programName.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(programName, duration));
        }

        System.out.println("Program's maximum duration? ");
        int maximumDuration = scanner.nextInt();

        for(TelevisionProgram televisionProgram: programs){
            if(televisionProgram.getDuration() <= maximumDuration){
                System.out.println(televisionProgram.getName() + ", " + televisionProgram.getDuration() + " minutes");
            }
        }
    }
}
