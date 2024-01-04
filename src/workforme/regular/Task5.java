package workforme.regular;
/*
Найти в строке все знаки препинания. Подсчитать общее количество их.
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String str = "Найти в строке все знаки препинания! Подсчитать?? общее количество их.";
        String [] words = str.split("\\s");
        int count = 0;
        Pattern pattern = Pattern.compile("[.,:;?!]");
        Matcher matcher = pattern.matcher(str);
        for(String word:words){
           System.out.print(word +" ");
           if(matcher.find()){
               count++;
           }
       }
        System.out.println();
        System.out.println("Количество знаков припенания в тексте равно: " + count);

    }
}
