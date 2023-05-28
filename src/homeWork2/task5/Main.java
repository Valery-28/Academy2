package homeWork2.task5;

/*
Задача 5:
Необходимо посчитать колличество слов в строке в которых буква
"с" встречается 3 и более раз.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String strings = "sdscccfs rewf sscccwrf wewcccegr cccsdsw";
        Pattern pattern = Pattern.compile("[C,c]{3,}");
        Matcher matcher = pattern.matcher(strings);
        String result = null;
        int countWord = 0;
        while (matcher.find()) {
            if (result == null || result.length() < strings.length()) {
                result = strings.substring(matcher.start(), matcher.end());
                countWord++;
            }
        }
        if (result == null) {
            System.out.println("Нет таких слов");
        } else {
            System.out.println("Количество слов с повторяющиемися 'с' 3 и более: " + countWord);
        }
    }
}
