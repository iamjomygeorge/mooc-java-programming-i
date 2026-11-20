
public class HealthStation {
    private int weighingsPerformed = 0;

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return weighingsPerformed;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        int weight = person.getWeight();
        weighingsPerformed++;
        return weight;
    }

}
