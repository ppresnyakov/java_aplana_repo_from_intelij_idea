import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int x=1,y=5,z=10,number;
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number == x | number == y| number == z) {
            System.out.println("Данное значение имеется в константах");
        }
            else
        {  System.out.println("Такой константы нет!");}

    }
    }

