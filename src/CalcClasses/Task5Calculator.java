package CalcClasses;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5Calculator {
    public static void main(String[] args) {
        int a,b;
        String OperationType;
        System.out.println("Это калькулятор. Введите первое число:");
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        Number Number1 = new Number(in.nextDouble());
        System.out.println("Введите 2 число:");
        Number Number2 = new Number(in.nextDouble());
        System.out.println("Введите математический оператор:");
        OperationType = in.next();
            try {
                Calclulator Calc1 = new Calclulator(Number1, Number2, OperationType);
                if (Calc1.getISResultOk()){System.out.println("Результат: " + Calc1.getResult());}
                else { System.out.println("Результата нет. Что то пошло не так: Число 1: " + Number1.getNumber() + " Число 2: " + Number2.getNumber() + " Операция - " + Calc1.getOperation() );}
            } catch (ArithmeticException ae)
            {System.out.println("На ноль делить нелья!"); }
        }
        catch (InputMismatchException Ie) {
            System.out.println("Вы что-то ввели не так. Попробовать ещё раз? Y/N");
            Scanner in = new Scanner(System.in);
            String Answer;
            Answer = in.next();
            if (Answer.equals("Y")){
                // решил попробовать рекурсию, но пришлось сделать массив. А без него можно? А то выглядит некрасиво
                String[]  string1 = new String[1];
                string1[0] = "test";
                main(string1);
            }

        }
    }
}
