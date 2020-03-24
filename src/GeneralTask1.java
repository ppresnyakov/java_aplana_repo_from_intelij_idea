import java.util.Scanner;

public class GeneralTask1 {
    public static void main(String[] args)
    {   int c,a,sum = 0;
        boolean flag = true;
        System.out.println("ВВедите число в бинарном формате:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Двоичное число состоит только из 1 и 0. Неверный ввод.");
                flag = false;
                break;
            }
            sum += (a * Math.pow(2, i));
        }
        if (flag){
        System.out.println("Число в десятичном формате:");
        System.out.println(sum);}
        else {
            System.out.println("Что то пошло не так.");
        }
    }
}
