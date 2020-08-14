import java.util.Random;
import java.util.Scanner;

public class Task_4_JAVA_2 {
    public static void main(String[] args) {
        int ArrayLenght = 20;
        int MyArray[] = new int[ArrayLenght];

        for (int i = 0; i < 20; i++) {
            MyArray[i] = (int) (Math.random()*20 - 10);}

        System.out.println("Получили массив:");
        for (int i = 0; i < ArrayLenght; i++) {
            System.out.print(MyArray[i]+ " ");
        }

        //находим максимальный из отризательных
        int MinMaxNegative = -11 ;
        int IndexOfMinMaxNegative  =0;
         for (int i = 0; i < ArrayLenght; i++) { if (MyArray[i] < 0 && MyArray[i] > MinMaxNegative  ){MinMaxNegative = MyArray[i]; IndexOfMinMaxNegative = i; }}

         //находим минимальный из положительный
        int MaxMinPositive = 11 ;
        int IndexOfMaxMinPositive = 0 ;
         for (int i = 0; i < ArrayLenght; i++) { if (MyArray[i] > 0 && MyArray[i] < MaxMinPositive  ){MaxMinPositive = MyArray[i]; IndexOfMaxMinPositive = i ; }}

        System.out.println(System.lineSeparator() + "Максимальный отрицательный: " + MinMaxNegative +  ". Его индекс - " + IndexOfMinMaxNegative)  ;
        System.out.println("Минимальный положительный: " + MaxMinPositive+  ". Его индекс - " + IndexOfMaxMinPositive);

        // меняем местами
        int Temp;
        Temp = MyArray[IndexOfMinMaxNegative];
        MyArray[IndexOfMinMaxNegative] = MyArray[IndexOfMaxMinPositive];
        MyArray[IndexOfMaxMinPositive] = Temp;

        System.out.println("Получили массив после замены:");
        for (int i = 0; i < ArrayLenght; i++) {
            System.out.print(MyArray[i]+ " ");
        }

}}
