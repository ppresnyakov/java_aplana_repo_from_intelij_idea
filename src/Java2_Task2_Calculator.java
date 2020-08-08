/**
Это калькулятор
 *Написал студент
 *Умеет складывать и умножать
 * @author Pavel
 * 28.07.2020
 */


import java.util.Scanner;

public class Java2_Task2_Calculator {
    public static void main(String[] args)
    {
        System.out.println("Это странная программа. Может запустить кальклуятор или найти самое длинное слово из массива.");
        System.out.println("Введите что нужно, 1 - калькулятор, 2 - работа с массивом слов:");
        Scanner in = new Scanner(System.in);
        int OperationType;
        OperationType = in.nextInt();
        if (OperationType == 1){Calculator();}
        else if  (OperationType == 2){MassiveSort();}
        else {
            System.out.println("Вы ввели не верную цифру, попробуйте ещё раз.");
        }

    }

    /**
     Это функция деления.
     *Написал студент
     *Умеет делить принимает два числа
     */
    public static Double  Division (double value1, double value2){
        double Summ ;
        Summ = value1 / value2;
        return Summ;}

    public static boolean  Calculator(){
        double a, b, sum;
        int OperationType;
        System.out.println("Вы запустили калькулятор.");
        System.out.println("Выберите операцию. 1 - складываем, 2 - умножаем, 3 делим, 4 вычитаем:");
        Scanner in = new Scanner(System.in);
        OperationType = in.nextInt();
        if (OperationType == 1 || OperationType == 2 || OperationType == 3 || OperationType == 4){
            System.out.println("Введите первое число:");
            a = in.nextDouble();
            System.out.println("Введите 2 число:");
            b = in.nextDouble();
            if (OperationType == 1 ){
                sum = a + b;
                System.out.printf("Вы выбрали сложение.Получилась сумма: %.4f", sum);
            }else if (OperationType == 2) {
                sum = a * b;
                System.out.printf("Вы выбрали умножение.Получилась сумма: %.4f", sum);
            }else if (OperationType == 3) {
                System.out.printf("Вы выбрали деление.Получилась сумма: %.4f", Division(a, b));
            }else if (OperationType == 4) {
                sum = a - b;
                System.out.printf("Вы выбрали вычитание.Получилась сумма: %.4f", sum);
            }
            else
            {System.out.println("Что-то пошло не так.");} }
        else{
            System.out.println("Надо было выбрать одну из предлагаемых операций. Пожалуйста выберите, только то что вам предложили.");
        }
     return true;
    }
    public static void  MassiveSort(){
        System.out.println("Введите размер массива:");
        Scanner in = new Scanner(System.in);
        int ArraySize = in.nextInt();

        String MyArray[] = new String[ArraySize];

        for (int i = 0; i < ArraySize; i++) {
            System.out.println("Введите " + i + " элемент массива ");
            MyArray[i] = in.next();
        }
        System.out.println("Вы ввели массив:");
        for (int i = 0; i < ArraySize; i++) {
            System.out.print(MyArray[i] + System.lineSeparator());
        }

        String LongWord = "";
        for (int i = 0; i < ArraySize; i++) {
            if (MyArray[i].length() > LongWord.length()) { LongWord = MyArray[i];}
        }
        System.out.println("Самое длинное слово в заданном массиве: " + LongWord);
    }
}




