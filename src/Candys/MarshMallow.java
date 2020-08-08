package Candys;

public class MarshMallow extends CandyMain {
    private int size;

    public MarshMallow(Double price, String brand, Double weight, int size) {
        super(price, brand, weight);
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MarshMallow{"+ super.toString()  + "size=" + size + '}';
    }
}
