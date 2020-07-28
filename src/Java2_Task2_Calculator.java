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
    {   double a, b, sum;
        int OpeationType;
        System.out.println("Вы запустили калькулятор.");
        System.out.println("Выберите операцию. 1 - складываем, 2 - умножаем, 3 делим:");
        Scanner in = new Scanner(System.in);
        OpeationType = in.nextInt();
        // тут мы складываем
        if (OpeationType == 1 ){
            System.out.println("Вы выбрали сложение. Введите 1 число:");
            a = in.nextDouble();
            System.out.println("Введите 2 число:");
            b = in.nextDouble();
            sum = a + b;
            System.out.printf("Получилась сумма: %.4f", sum);
        //тут мы умножаем
        }else if (OpeationType == 2) {
            System.out.println("Вы выбрали умножение. Введите 1 число:");
            a = in.nextDouble();
            System.out.println("Введите 2 число:");
            b = in.nextDouble();
            sum = a * b;
            System.out.printf("Получилась сумма: %.4f", sum);
        }else if (OpeationType == 3) {
            System.out.println("Вы выбрали деление. Введите 1 число:");
            a = in.nextDouble();
            System.out.println("Введите 2 число:");
            b = in.nextDouble();
            System.out.printf("Получилась сумма: %.4f", Division(a,b));
        }else
                {System.out.println("Надо было выбрать одну из предлагаемых операций, повезёт в следующий раз.");}}
     /**
     Это функция деления
     *Написал студент
     *Умеет делить принимает два числа
     */
    public static Double  Division(double value1, double value2){
        double Summ;
        Summ = value1 / value2;
        return Summ;
    }
}




