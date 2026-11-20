
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

    public String longest(){
        String longestString = "";
        int longestStringLength = 0;
        if(elements.isEmpty()){
            return null;
        }else{
            for(int i=0; i<elements.size(); i++){
                if(elements.get(i).length() > longestStringLength){
                    longestStringLength = elements.get(i).length();
                    longestString = elements.get(i);
                }
            }
            return longestString;
        }
    }
}
