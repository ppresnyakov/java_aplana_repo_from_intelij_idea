
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args)
    {
        int ArraySize;
        System.out.println("Введите размер массива:");
        Scanner in = new Scanner(System.in);
        ArraySize = in.nextInt();

        int MyArray[] = new int[ArraySize];

        for (int i = 0; i<ArraySize; i++ ){
            System.out.println("Введите "+ i + " элемент массива ");
            MyArray[i] = in.nextInt();
        }

        System.out.println("Элементы массива, умноженные на 2.");
        for (int i = 0; i<ArraySize; i++ ){
            System.out.print(MyArray[i]* 2 + " ");

        }


    }
}