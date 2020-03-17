import java.io.*;


public class Task18 {
    public static void main(String[] args) {
        String s;
        int CountLines = 0;
        try { BufferedReader br = new BufferedReader(new FileReader("f:/test.txt"));
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
                CountLines++;
            }
            br.close();
        }
        catch (IOException exc) {
            System.out.println("Ошибка чтения файла");}

        int i = 1; // счётчик строк
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (CountLines > 0) {
        System.out.println("Вы можете вввести " + CountLines + " строк(и). Вводите:"  );
        try {
            FileWriter fw = new FileWriter("F:/test.txt");
            do {
                System.out.print("Введите " +  i + " строку:");
                s = br.readLine();
                if (s.compareTo("стоп") == 0) break;
                s = s + "\r\n";
                fw.write(s);
                i++;
            } while (i <= CountLines );
            fw.close();
        } catch (IOException exc) {
            System.out.println("Ошибка ввод вывода: " + exc);
        }}
        else{ System.out.println("В файле 0 строк. Вы не можете ничего записать.");}




    }
}




