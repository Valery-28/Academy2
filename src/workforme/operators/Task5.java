package workforme.operators;

import java.util.Scanner;

/*
Напишите программу, которая будет переводить секунды в форматированный вид - дни часы минуты
    секунды учитывая окончания слов.
    Пример:
        1249 -> 20 минут 49 секунд
        648958 -> 7 дней 12 часов 15 минут 58 секунд
    Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды

 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameSec;
        String nameMin;
        String nameHour;
        String nameDay;
        String nameMount;
        String nameYear;
        System.out.print("Enter your time in sec: ");
        long enterTimeSec = scanner.nextLong();
        long sec = enterTimeSec % 60;
        long min = enterTimeSec / 60;
        long hour= min / 60;
        long day = hour / 24;
        long mount = day / 30;
        long year = mount/12;
        min = min % 60;
        hour = hour % 24;
        day = day % 30;
        mount = mount%12;
        switch (Math.toIntExact(sec % 10)) {
            case 1 -> nameSec = " секунда.";
            case 2, 3, 4 -> nameSec = " секунды.";
            default ->  nameSec = " секунд.";
        }
        switch (Math.toIntExact(min % 10)) {
            case 1 -> nameMin = " минута ";
            case 2, 3, 4 -> nameMin = " минуты ";
            default -> nameMin = " минут ";
        }
        switch (Math.toIntExact(hour)) {
            case 1,21 -> nameHour = " час ";
            case 2, 3, 4,22,23 -> nameHour = " часа ";
            default -> nameHour = " часов ";
        }
        switch (Math.toIntExact(day)) {
            case 1,21 -> nameDay = " день ";
            case 2,3,4,22,23,24 -> nameDay = " дня ";
            default-> nameDay = " дней ";
        }
        switch (Math.toIntExact(mount)) {
            case 1 -> nameMount = " месяц ";
            case 2, 3, 4 -> nameMount = " месяца ";
            default -> nameMount = " месяцев ";
        }
        switch (Math.toIntExact(year % 10)) {
            case 1 -> nameYear = " год ";
            case 2, 3, 4 -> nameYear = " года ";
            default-> nameYear = " лет ";
        }
        System.out.println("Date: " +year + nameYear + mount + nameMount + day
                + nameDay + hour + nameHour + min + nameMin + sec + nameSec);
    }
}
