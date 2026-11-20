import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcaseList;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        suitcaseList = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        int weight = suitcase.totalWeight();
        if(getWeight() + weight <= maximumWeight){
            suitcaseList.add(suitcase);
        }
    }

    public int getWeight(){
        int weight = 0;
        if(suitcaseList.isEmpty()){
            return weight;
        }else{
            for(Suitcase suitcase : suitcaseList){
                weight += suitcase.totalWeight();
            }
            return weight;
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcaseList) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString(){
        int numberOfSuitcase = suitcaseList.size();
        switch(numberOfSuitcase){
            case 0:
                return "no suitcase (0 kg)";
            case 1:
                return "1 suitcase (" + getWeight() + " kg)";
            default:
                return suitcaseList.size() + " suitcases (" + getWeight() + " kg)";
        }
    }
}
