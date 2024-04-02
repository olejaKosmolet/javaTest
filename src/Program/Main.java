package Main;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import AnalyzeWordFrequency.java;

public class Main {
    public static void main (String[] args) {
        countWords("X:\\aducation\\JAVA\\interimTest\\InterimTest1\\src\\main\\input.txt");
        findLongestWord("X:\\aducation\\JAVA\\interimTest\\InterimTest1\\src\\main\\input.txt");
        AnalyzeWordFrequency("X:\\aducation\\JAVA\\interimTest\\InterimTest1\\src\\main\\input.txt");
    }

    public static void countWords(String filePath) {
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

            System.out.println("Количество слов в файле: " + wordCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
    public static void findLongestWord(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Самое длинное слово в файле: " + longestWord);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}