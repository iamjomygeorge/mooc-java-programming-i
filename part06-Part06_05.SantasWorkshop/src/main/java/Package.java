import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> packageList;

    public Package(){
        packageList = new ArrayList<Gift>();
    }

    public void addGift(Gift gift){
        packageList.add(gift);
    }

    public int totalWeight(){
        int weight = 0;
        for(Gift packageList : packageList){
            weight += packageList.getWeight();
        }
        return weight;
    }
}
