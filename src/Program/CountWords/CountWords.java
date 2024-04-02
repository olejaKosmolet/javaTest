package Program.CountWords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {
    public void countWords(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            int wordCount = 0;
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!word.isEmpty()) {
                    wordCount++;
                }
            }

            System.out.println("Количество слов в файле: \u001B[32m"  + wordCount + "\u001B[0m");
            System.out.println();

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}
