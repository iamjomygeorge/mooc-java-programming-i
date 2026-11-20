import java.util.ArrayList;

public class Room {
    private ArrayList<Person> person;

    public Room(){
        person = new ArrayList<Person>();
    }

    public void add(Person person){
        this.person.add(person);
    }

    public boolean isEmpty(){
        if(person.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return person;
    }

    public Person shortest(){
        int counter = 0;
        int shortestHeight = 0;
        if(person.size() > 0){
            shortestHeight = person.get(0).getHeight();
        }else{
            return null;
        }
        for(int i=1; i<person.size(); i++){
            if(person.get(i).getHeight() < shortestHeight){
                counter = i;
                shortestHeight = person.get(i).getHeight();
            }
        }
        return person.get(counter);
    }

    public Person take(){
        Person person = shortest();
        if(person == null){
            return null;
        }else{
            this.person.remove(person);
            return person;
        }
    }
}
