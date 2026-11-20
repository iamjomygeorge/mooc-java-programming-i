import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> itemsList;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        itemsList = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        int itemWeight = item.getWeight();
        int totalWeight = totalWeight();
        if (totalWeight + itemWeight <= maximumWeight) {
            itemsList.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        if (itemsList.size() > 0) {
            for (Item item : itemsList) {
                totalWeight += item.getWeight();
            }
        }
        return totalWeight;
    }

    public void printItems(){
        if(itemsList.size() > 0){
            for(Item item : itemsList){
                System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
            }
        }
    }

    public Item heaviestItem(){
        Item item = null;
        if(itemsList.isEmpty()){
            return null;
        }else{
            int currentWeight = itemsList.get(0).getWeight();
            for(int i=1; i<itemsList.size(); i++){
                if(itemsList.get(i).getWeight() > currentWeight){
                    currentWeight = itemsList.get(i).getWeight();
                    item = itemsList.get(i);
                }
            }
            return item;
        }
    }

    @Override
    public String toString(){
        int totalWeight = totalWeight();
        int numberOfItems = itemsList.size();
        switch(numberOfItems){
            case 0:
                return "no items (0 kg)";
            case 1:
                return "1 item (" + totalWeight + " kg)";
            default:
                return numberOfItems + " items (" + totalWeight + " kg)";
        }
    }
}
