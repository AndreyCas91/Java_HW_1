package hw7;

public class Plate {
    private int amount;
    private int fill;

    public Plate(int amount) {
        this.amount = amount;
    }

    public boolean eating(int amo){
        if(amount - amo > 0){
            amount -= amo;
            return true;
        } else{
            return false;
        }
    }

    public void fill(int eat){
        amount += eat;
        System.out.println("Еда в тарелке пополнена до " + amount);
    }

    @Override
    public String toString() {
        return "В тарелке осталось " + amount + " еды.";
    }
}
