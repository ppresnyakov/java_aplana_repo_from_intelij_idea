import java.util.Scanner;

public class Task6 {
    public static void main(String[] args)
    {
        int x,y,z,middlenumber;
        System.out.println("Введите x:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.println("Введите y:");
        y = in.nextInt();
        System.out.println("Введите z:");
        z = in.nextInt();
        middlenumber = ((x + y + z)/3);
        System.out.println("Среднее арифметическое: " + middlenumber  );
        System.out.println("Среднее арифметическое, поделенное на 2 без остатка: " + (middlenumber/2) );
        if ((middlenumber/2) > 3) {
            System.out.println("Программа выполнена правильно." );
        }
    }
}