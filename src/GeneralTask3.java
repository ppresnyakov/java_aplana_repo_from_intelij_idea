import java.util.Scanner;

public class GeneralTask3 {
    public static void main(String[] args)
    {
        System.out.println("ВВедите курс доллара: ");
        Scanner in = new Scanner(System.in);
        double DollarCourse = in.nextDouble();
        System.out.println("Сколько у вас рублей? : ");
        double Roubles = in.nextDouble();
        double sum = Roubles / DollarCourse;
        System.out.printf("Вы можете получить: " + " %.2f долларов" , sum);
    }
}
