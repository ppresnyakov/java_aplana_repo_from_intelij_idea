
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner in = new Scanner(System.in);
        int ArraySize = in.nextInt();

        int MyArray[] = new int[ArraySize];

        for (int i = 0; i < ArraySize; i++) {
            System.out.println("Введите " + i + " элемент массива ");
            MyArray[i] = in.nextInt();
        }
        System.out.println("Вы ввели массив:");
        for (int i = 0; i < ArraySize; i++) {
            System.out.print(MyArray[i] + " ");
        }
        int temp;
        //начинаем сортировать пызырьком
        for (int i = ArraySize -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (MyArray[j] > MyArray[j + 1]) {
                    temp = MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j+1] = temp;
                }
            }
        }
        System.out.println(System.lineSeparator() + "Массив после сортировки:");
        for (int i = 0; i < ArraySize; i++) {
            System.out.print(MyArray[i] + " ");
        }
    }}

