public class Container {
    public int amountOfLiquid;

    public Container(){
        amountOfLiquid = 0;
    }

    public int contains(){
        return amountOfLiquid;
    }

    public void add(int amount){
        if (amount < 0) {
            return;
        }

        if (amountOfLiquid + amount > 100){
            amountOfLiquid = 100;
        } else {
            amountOfLiquid += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (amountOfLiquid - amount < 0) {
            amountOfLiquid = 0;
        } else {
            amountOfLiquid -= amount;
        }
    }

    public String toString(){
        return amountOfLiquid + "/" + 100;
    }
}
