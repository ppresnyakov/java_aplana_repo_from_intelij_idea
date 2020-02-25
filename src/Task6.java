import java.util.Scanner;

public class Task6 {
    public static void main(String[] args)
    {
        System.out.println("Введите x:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введите y:");
        int y = in.nextInt();
        System.out.println("Введите z:");
        int z = in.nextInt();
        double middlenumber = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + middlenumber);
        System.out.println("Среднее арифметическое, поделенное на 2 без остатка: " + middlenumber / 2);
        if ( middlenumber / 2  > 3) {
            System.out.println("Программа выполнена правильно." );
        }
    }
}