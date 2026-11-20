import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager(){
        jokes = new ArrayList<String>();
    }

    public void addJoke(String joke){
        jokes.add(joke);
    }

    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }

        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }

    public void printJokes(){
        if(!jokes.isEmpty()){
            for(String joke : jokes){
                System.out.println(joke);
            }
        }
    }
}
