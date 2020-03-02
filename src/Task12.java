
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args)
    {
        System.out.println("Введите строку, пробелы будут убраны:");
        Scanner in = new Scanner(System.in);
        String MyString = in.nextLine();
        String WithoutSpaces = MyString.replaceAll(" ", "");
        System.out.println( WithoutSpaces);
        //а теперь попробуем самим реализовать вручную
        System.out.println("Введите строку опять, пробелы будут убраны, но уже ручным методом:");
        MyString = in.nextLine();
        int StringLength = MyString.length();
        WithoutSpaces = "";
        for (int i = 0; i < StringLength; i++){
            if  (MyString.charAt(i) != ' ')
            { WithoutSpaces = WithoutSpaces + MyString.charAt(i); }
        }
        System.out.println( WithoutSpaces);
    }
}



