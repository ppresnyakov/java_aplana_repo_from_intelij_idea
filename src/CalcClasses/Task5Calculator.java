package CalcClasses;


import java.util.Scanner;

public class Task5Calculator {
    public static void main(String[] args) {
        int a,b;
        String OperationType;
        System.out.println("Это калькулятор. Введите первое число:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        Number Number1 = new Number(in.nextDouble());
        System.out.println("Введите 2 число:");
        Number Number2 = new Number(in.nextDouble());
        System.out.println("Введите математический оператор:");
        OperationType = in.next();
        Calclulator Calc1 = new Calclulator(Number1,Number2, OperationType);
        if (Calc1.getISResultOk()){System.out.println("Результат: " + Calc1.getResult());}
        else { System.out.println("Результата нет. Что то пошло не так: Число 1 " + Number1.getNumber() + "Число 2" + Number1.getNumber() + " Операция - " + Calc1.getOperation() );}
    }
}
