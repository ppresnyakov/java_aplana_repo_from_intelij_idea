import java.io.*;

public class Task16 {
    public static void main(String[] args) {
        String s;
        try { BufferedReader br = new BufferedReader(new FileReader("test16.txt"));
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
            br.close();
        }
        catch (IOException exc) {
            System.out.println("Ошибка чтения файла");}
    }
}




