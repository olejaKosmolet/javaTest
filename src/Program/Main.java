package Program;

import Program.AnalyzeWordFrequency.AnalyzeWordFrequency;
import Program.CountWords.CountWords;
import Program.FindLongestWord.FindLongestWord;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        String filePath = "X:\\aducation\\JAVA\\interimTest\\InterimTest1\\src\\Program\\input.txt";

        CountWords firstRool = new CountWords();
        FindLongestWord secondRool = new FindLongestWord();
        AnalyzeWordFrequency thirdRool = new AnalyzeWordFrequency();

        boolean flag = true;

        Scanner in = new Scanner(System.in);

        while (flag){

            System.out.println("Введите запрос на выполнение желаемой задачи:\n" +
                    "1 - посчитать кол-во слов\n" +
                    "2 - найти самое длинное слово\n3 - просмотреть частоту повторов каждого слова\n" +
                    "4 - завершить работу");

            int num = in.nextInt();

            System.out.printf("Ваш номер запроса - %d, идёт обработка...\n", num);
            switch (num){
                case 1:
                    System.out.println("\nПодсчитываю все слова в файле...\n");
                    firstRool.countWords(filePath);
                    break;
                case 2:
                    System.out.println("\nИшу самое длинное слово в файле...\n");
                    secondRool.findLongestWord(filePath);
                    break;
                case 3:
                    System.out.println("\nПодсчитываю частоту повторов каждого слова в файле...\n");
                    thirdRool.analyzeWordFrequency(filePath);
                    break;
                case 4:
                    System.out.println("\nЗавершение работы...");
                    flag = false;
                    return;
            }
            in.nextLine();
        }
        in.close();
    }
}