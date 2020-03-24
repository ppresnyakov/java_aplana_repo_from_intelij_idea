import java.util.Scanner;

public class GeneralTask2 {
    public static void main(String[] args)
    {
        System.out.println("Введите размерность массива:");
        Scanner in = new Scanner(System.in);
        int ArraySize = in.nextInt();
        System.out.println("Заполните массив:");
        int array[] = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            int CurrentValue = in.nextInt();
            array[i] = CurrentValue;
        }
        System.out.println("Вы ввели массив:");
        for (int i = 0; i < ArraySize; i++) {
            System.out.print(" " + array[i] );
        }

        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1]){
                    int temp;
                     temp = array[j];
                     array[j] = array[j-1];
                     array[j-1] = temp;}
                else
                    break;
            }
        }
        System.out.println();
        System.out.println("Осортировали массив:");
        for (int i = 0; i < ArraySize; i++) {
            System.out.print(" " + array[i] );
        }
    }
}
