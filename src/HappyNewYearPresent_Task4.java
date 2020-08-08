import Candys.Choclate;
import Candys.ChupaChups;
import Candys.MarshMallow;
import Candys.CandyMain;

public class HappyNewYearPresent_Task4 {
    public static void main(String[] args) {
        Choclate choclate1 = new Choclate(12.5,"Alpen Gold", 0.5, true);
        ChupaChups ChupaChups1 = new ChupaChups(5.5,"USA", 0.2, 0.05);
        MarshMallow MarshMallow1 = new MarshMallow(7.5,"CHINA", 0.3, 5);

        Double GeneralWeight = 0.0;
        Double GeneralPrice = 0.0;


        System.out.println("Позиции подарка:");
        CandyMain [] box = {choclate1,ChupaChups1,MarshMallow1};
        for (CandyMain someCandy : box){
            System.out.println(someCandy.toString());
            GeneralWeight = GeneralWeight +  someCandy.getWeight();
            GeneralPrice = GeneralPrice + someCandy.getPrice();
        }

        System.out.println("Итоговый вес подарка:" + GeneralWeight);
        System.out.println("Итоговая цена подарка:" + GeneralPrice);
    }
}
