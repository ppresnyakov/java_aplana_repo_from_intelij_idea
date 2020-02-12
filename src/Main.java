import java.util.Scanner;



public class Main {
        // А тут мы решили залить просто комменатрий.
    public static void main(String[] args)

    {
        System.out.println("Привет как дела? Давай сложу числа?");
        Scanner in = new Scanner(System.in);
        System.out.println("Введи 1-ое -число: ");
        int a = in.nextInt();
        System.out.println("Введи 2-ое -число: ");
        int b = in.nextInt();
        System.out.print("Итоговая сумма: ");
        System.out.print(a+b);
    }
}
