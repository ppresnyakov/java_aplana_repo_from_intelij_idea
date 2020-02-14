import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Привет как дела? Давай сложу числа?");
        Scanner in = new Scanner(System.in);
        System.out.println("Введи 1-ое -число: ");
        int firstInt = in.nextInt();
        System.out.println("Введи 2-ое -число: ");
        int secondInt = in.nextInt();
        System.out.print("Итоговая сумма: ");
        System.out.println(firstInt + secondInt);
        System.out.println(" Было приятно познакомиться.");
    }
}
