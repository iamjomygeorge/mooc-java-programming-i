
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString(){
        if(elements.size() < 1){
            return "The collection " + name + " is empty.";
        }else if(elements.size() == 1){
            String s = "The collection " + name + " has 1 element:\n";
            return s + elements.get(0);
        }else{
            String s = "The collection " + name + " has " + elements.size() + " elements:\n";
            String list = "";
            for(String element : elements){
                list += element + "\n";
            }
            return s + list;
        }
    }
}
