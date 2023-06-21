package homeWorks.homeWork2.task7;

/*
Необходимо узнать есть ли в строке слова которые начинаются
и заканчиваются на букву "а".
 */
public class Main {
    public static void main(String[] args) {
        String strings = "Lorema ipsum adolora sit ameta , consectetur adipiscing elit. Nulla amalesuada";
        for (String word : strings.split(" ")) {
            if (word.startsWith("a") && word.endsWith("a")) {
                System.out.println(word);
            }
        }
    }
}
