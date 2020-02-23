import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)
    {
        int NumberD;
        System.out.println("Привет как дела? Введи число, а я выведу для него таблицу умножения. Принимаю от 1 до 10.");
        Scanner in = new Scanner(System.in);

        NumberD = in.nextInt();
        System.out.println("Таблица умножения для числа " + NumberD +":");
        System.out.println( NumberD + " X 1 = " + NumberD );
        System.out.println( NumberD + " X 2 = " + NumberD * 2);
        System.out.println( NumberD + " X 3 = " + NumberD * 3);
        System.out.println( NumberD + " X 4 = " + NumberD * 4);
        System.out.println( NumberD + " X 5 = " + NumberD * 5);
        System.out.println( NumberD + " X 6 = " + NumberD * 6);
        System.out.println( NumberD + " X 7 = " + NumberD * 7);
        System.out.println( NumberD + " X 8 = " + NumberD * 8);
        System.out.println( NumberD + " X 9 = " + NumberD * 9);
        System.out.println( NumberD + " X 10 = " + NumberD * 10);

    }
}
