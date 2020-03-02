
import java.io.FileReader;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args)
    {
        System.out.println("Введите первую строку:");
        Scanner in = new Scanner(System.in);
        String FirstString = in.nextLine();
        System.out.println("Введите вторую строку:");
        String SecondString = in.nextLine();
        if (FirstString.length() > SecondString.length()){
            System.out.println(FirstString);}
            else if (FirstString.length() < SecondString.length()) {
            System.out.println(SecondString);
        }
        else if (FirstString.length() == SecondString.length()){
            System.out.println("Длина строк одинакова");
        }
        else{System.out.println("Что-то пошло не так.");}
    }
}

