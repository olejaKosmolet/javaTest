package Program.FindLongestWord;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindLongestWord {
    public void findLongestWord (String filePath){
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            String longestWord = "";
            while(scanner.hasNext()) {
                String word = scanner.next();
                if(word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Самое длинное слово в файле: \u001B[32m" + longestWord + "\u001B[0m");
            System.out.println();

            scanner.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}
