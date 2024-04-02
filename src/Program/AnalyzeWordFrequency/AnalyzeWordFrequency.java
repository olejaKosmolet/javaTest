package Program.AnalyzeWordFrequency;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnalyzeWordFrequency {
    public void analyzeWordFrequency(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            Map<String, Integer> wordFrequency = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z ]", "");
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            for (String word : wordFrequency.keySet()) {
                System.out.println(STR."Слово\u001B[32m '\{word}' \u001B[0m встречается \u001B[32m \{wordFrequency.get(word)} \u001B[0m раз(а)");

            }
            System.out.println();

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}
