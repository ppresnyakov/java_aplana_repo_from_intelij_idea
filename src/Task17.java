import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Набирайте текст для записи его в файл. Как закончите, наберите команду остановки.");

        try {
            FileWriter fw = new FileWriter("F:/test2.txt");
            do {
                System.out.print("Введите текст: ");
                str = br.readLine();
                if (str.compareTo("стоп") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("стоп") != 0);
            fw.close();
        } catch (IOException exc) {
            System.out.println("Ошибка ввод вывода: " + exc);
        }
    }
}




