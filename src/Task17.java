import java.io.*;

public class Task17 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Набирайте текст для записи его в файл. Как закончите, наберите команду остановки.");

        try {
            FileWriter fw = new FileWriter("test17.txt");
            do {
                System.out.print("Введите текст: ");
                String str = br.readLine();
                if (str.equals("стоп")) break;
                str = str + "\r\n";
                fw.write(str);
            } while (true) ;
            fw.close();
        } catch (IOException exc) {
            System.out.println("Ошибка ввод вывода: " + exc);
        }
    }
}




