package Candys;

public class SetOfCandy {
    private CandyMain[]  TheSet;
    private Double FullPrice = 0.0;
    private Double FullWeight = 0.0;

    public SetOfCandy(CandyMain[] TheSet) {this.TheSet = TheSet;}

    public double getFullPrice(){
        for (CandyMain someCandy : TheSet){ FullPrice = FullPrice +  someCandy.getPrice(); }
        return FullPrice;
    }
    public double getFullWeight(){
        for (CandyMain someCandy : TheSet){ FullWeight = FullWeight +  someCandy.getWeight(); }
        return FullWeight;
    }
    public double getAllPositions(){
        System.out.println("Позиции подарка:");
        for (CandyMain someCandy : TheSet){ System.out.println(someCandy.toString()); }
        return FullPrice;
    }


}

