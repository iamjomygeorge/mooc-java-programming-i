
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money moneyAddition){
        int currentEuro = euros + moneyAddition.euros;
        int currentCents = cents + moneyAddition.cents;
        Money money = new Money(currentEuro, currentCents);
        return money;
    }

    public boolean lessThan(Money compared){
        if(euros < compared.euros){
            return true;
        }else if(euros == compared.euros && cents < compared.cents){
            return true;
        }
        else{
            return false;
        }
    }

    public Money minus(Money decreaser){
        int thisMoney = (euros * 100) + cents;
        int decreaserMoney = (decreaser.euros * 100) + decreaser.cents;

        int difference = thisMoney - decreaserMoney;
        if(difference <= 0){
            Money money = new Money(0, 0);
            return money;
        }else{
            int euros = difference / 100;
            int cents = difference % 100;
            Money money = new Money(euros, cents);
            return money;
        }
    }
}
