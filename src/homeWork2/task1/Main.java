package homeWork2.task1;

/*
Задача 1:
Задача с месяцами года.

Необходимо реализовоть класс который имеет два метода:
1) определить номер месяца по имени.
2) определить имя месяца по номеру.
Рекоменндованно использовать Enum.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Month.getNameByNumber(4));
        System.out.println(Month.getNumberByName("FEBRUARY"));
    }
}
