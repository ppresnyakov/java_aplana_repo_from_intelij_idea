package Candys;

public class Choclate extends CandyMain {
     private boolean Sugar;
    public Choclate(Double price, String brand, Double weight, boolean Sugar) {
        super(price, brand, weight);
        this.Sugar = Sugar;
    }

    public void setSugar(boolean sugar) {
        Sugar = sugar;
    }

    public boolean isSugar() {
        return Sugar;
    }

    @Override
    public String toString() {
        return "Choclate{" + super.toString() + "Sugar=" + Sugar + '}';
    }
}
