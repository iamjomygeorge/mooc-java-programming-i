import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        scan.close();
        int gameCounter = 0;
        int winCounter = 0;
        int lossCounter = 0;

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                if(homeTeam.equals(team) || visitingTeam.equals(team)){
                    gameCounter++;
                }

                if(homeTeam.equals(team) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                    winCounter++;
                }

                if(visitingTeam.equals(team) && Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                    winCounter++;
                }

                if(homeTeam.equals(team) && Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])){
                    lossCounter++;
                }

                if(visitingTeam.equals(team) && Integer.valueOf(parts[3]) < Integer.valueOf(parts[2])){
                    lossCounter++;
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + lossCounter);
    }

}
