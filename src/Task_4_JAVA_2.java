import java.util.Random;
import java.util.Scanner;

public class Task_4_JAVA_2 {
    public static void main(String[] args) {
        int ArrayLenght = 19;
        int MyArray[] = new int[ArrayLenght];

        for (int i = 0; i < 10; i++) {
            MyArray[i] = (int) (Math.random()*(-100));
        }
        for (int i = 9; i < 19; i++) {
            MyArray[i] = (int) (Math.random()*(100));
        }
        System.out.println("Получили массив:");
        for (int i = 0; i < ArrayLenght; i++) {
            System.out.print(MyArray[i]+ " ");
        }

        //находим максимальный из отризательных
        int MinMaxNegative = MyArray[0] ;
         for (int i = 0; i < ArrayLenght; i++) { if (MyArray[i] < 0 && MyArray[i] > MinMaxNegative  ){MinMaxNegative = MyArray[i];}}

         //находим минимальный из положительный
        int MaxMinPositive = MyArray[10] ;
         for (int i = 0; i < ArrayLenght; i++) { if (MyArray[i] > 0 && MyArray[i] < MaxMinPositive  ){MaxMinPositive = MyArray[i];} }

        System.out.println(System.lineSeparator() + "Максимальный отрицательный: " + MinMaxNegative);
        System.out.println("Минимальный положительный: " + MaxMinPositive);
}}
