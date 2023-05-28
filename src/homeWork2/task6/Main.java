package homeWork2.task6;
/*
Задача 6:
Необходимо найти самое длинное слово в строке.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputStrings = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nulla malesuada, nibh quis ultricies tincidunt, erat libero bibendum nibh, et porta diam nisl.";
        Pattern pattern = Pattern.compile("\\w*");
        Matcher matcher = pattern.matcher(inputStrings);
        String longesWord = null;


        while (matcher.find()) {
            int lenght = matcher.end() - matcher.start();

            if (longesWord == null || longesWord.length() < lenght) {
                longesWord = inputStrings.substring(matcher.start(), matcher.end());
            }
        }
        System.out.println(longesWord);
    }
}
