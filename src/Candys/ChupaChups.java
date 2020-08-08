package Candys;

public class ChupaChups extends CandyMain {


    private double Length;
    public ChupaChups(Double price, String brand, Double weight, double Length) {
        super(price, brand, weight);
        this.Length = Length;
    }

    public double getLength() {
        return Length;
    }
    public void setLength(double length) {
        Length = length;
    }

    @Override
    public String toString() {
        return "ChupaChups{"+ super.toString() + "Length=" + Length + '}';
    }
}
