import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int c,a,sum = 0;
        System.out.println("Привет как дела? ВВедите число в бинарном формате. Я переведу его в десячтный вид.");
        Scanner in = new Scanner(System.in);

        System.out.println("Введи число в бинарном формате: ");
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Двоичное число состоит только из 1 и 0. Неверный ввод.");
                break;
            }
            sum += (a * Math.pow(2, i));
        }
        System.out.println(sum);
    }
}
