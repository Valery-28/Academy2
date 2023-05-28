package homeWork2.task9;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Реализовать программу которая проверит содержит ли строка некое слово, и если да то
напечатает индекс первого символа данного слова.
 */
public class Main {
    public static void main(String[] args) {
        String str = "I very love Java";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String word = matcher.group();
            int index = str.indexOf(word);
            System.out.println("Слово " + word + " найдено. Индекс первого символа: " + index);
        }
    }
}