
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args)
    {
        System.out.println("Введите число в строковую переменную S:");
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int X =  Integer.parseInt(S);
        double Y = X;
        System.out.println("Получили числа:");
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}



