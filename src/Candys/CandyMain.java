package Candys;

public class  CandyMain {
    private Double price;
    private String Brand;
    private Double Weight;

    public CandyMain(Double price, String brand, Double weight) {
        this.price = price;
        this.Brand = brand;
        this.Weight = weight;
    }
    public Double getPrice() {
        return price;
    }

    public String getBrand() { return Brand;}

    public Double getWeight() {
        return Weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "CandyMain{" +
                "price=" + price +
                ", Brand='" + Brand + '\'' +
                ", Weight=" + Weight +
                '}';
    }
}
