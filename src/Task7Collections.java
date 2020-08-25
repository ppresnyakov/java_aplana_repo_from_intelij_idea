import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task7Collections {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> Words = new ArrayList<String>();
        try(FileReader reader = new FileReader("test.txt"))
        {
            // читаем посимвольно
            int c;
            String temp = "";
            while((c=reader.read())!=-1){
                if (c == 32) {
                    Words.add(temp);
                    temp = "";
                }
                 else{ temp = temp + (char)c;}
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        //сортируем
        Collections.sort(Words);
        // Создаём HashMap Слово - Количество повторений
        Map<String, Integer > WordMap = new HashMap<String, Integer>();
        for (Object word : Words) {
            if (!WordMap.containsValue(word))
            { WordMap.put( (String) word, Collections.frequency(Words, word ));}
        }
        // переменные для определения самого повторяемого слова
        Integer MaxRepeatNumber = 0;
        // выводим слова и количество повторений
        for(Map.Entry<String, Integer> pair : WordMap.entrySet())
        {
            Integer value = pair.getValue();
            System.out.println("Слово " +  pair.getKey() + " повторяется "  + value + " раз.") ;
            //заодно найдём максимальное число, повторяемости слова
            if (value > MaxRepeatNumber) {  MaxRepeatNumber = value;}
            
        }
        // выведем статистику по самым повторяемым словам
        System.out.println("Статистика самых повторяемых слов:");
        for(Map.Entry<String, Integer> pair : WordMap.entrySet())
        {
            Integer value = pair.getValue();
            if (value == MaxRepeatNumber)
            {System.out.println("Слово " +  pair.getKey() + " повторяется "  + value + " раз.") ;}
        }

    }

}
