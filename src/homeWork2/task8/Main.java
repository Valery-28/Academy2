package homeWork2.task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задача 8:
Необходимо извлечь из строки и распечатать номер карты
(XXXX-XXXX-XXXX-XXXX) если он там есть.
 */
public class Main {
    public static void main(String[] args) {
        String strings = "xzvpsk dvksw f dsfsdwffwe sdfsdfsd ff 5542-2332-2342-6757 ytfvub yvbyub";
        Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
        Matcher matcher = pattern.matcher(strings);
        while (matcher.find()) {
            String card = matcher.group();
            System.out.println(card);
        }
    }
}


