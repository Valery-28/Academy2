package class_works.hw;

/*
Дан текст. Подпишите уникальное количество слов в тексте.
Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
Пробелы могут присутствовать в начале и в конце текста.

Примеры уникальности слов:

dog и Dog - одинаковые
dog и dogs - разные
new и NEW - одинаковые
New и News - разные
 */
public class task4 {
    public static void main(String[] args) {
        String text = "Получается, что вроде получилось, да? Получается... что да!";
        System.out.println(text);
        text = text.replaceAll("\\p{Punct}", "");
        text = text.trim();
        System.out.println(text);
        String[] words = text.split("\\s");
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < words.length; i++) {
            for (String word : words) {
                if (words[i].equalsIgnoreCase(word)) {
                    tempCount++;
                }
            }
            if (tempCount >= 2) {
                count++;
            }
            tempCount = 0;
            words[i] = null;
        }
        System.out.println("Всего количество слов: " + words.length);
        System.out.println("Количество уникальных слов: " + count);
    }
}

