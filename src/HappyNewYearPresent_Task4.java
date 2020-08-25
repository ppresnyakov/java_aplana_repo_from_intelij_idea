import Candys.*;

public class HappyNewYearPresent_Task4 {
    public static void main(String[] args) {
        CandyMain choclate1 = new Choclate(12.5,"Alpen Gold", 0.5, true);
        CandyMain ChupaChups1 = new ChupaChups(5.5,"USA", 0.2, 0.05);
        CandyMain MarshMallow1 = new MarshMallow(7.5,"CHINA", 0.3, 5);

        CandyMain Present[] = {choclate1,ChupaChups1,MarshMallow1};

        SetOfCandy box = new SetOfCandy(Present);
        System.out.println("Итоговый вес подарка:" + box.getAllPositions());
        System.out.println("Итоговая цена подарка:" + box.getFullPrice());
        System.out.println("Итоговая цена подарка:" + box.getFullWeight());
    }
}
