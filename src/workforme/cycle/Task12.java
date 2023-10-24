package workforme.cycle;
/*
Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия указывается
симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
 */

public class Task12 {
    public static void main(String[] args) {
        int hour = 23;
        int minute = 59;
        int reversHour;
        int count = 0;
        for (int i = 0; i <= hour; i++) {
            reversHour = ((i % 10) * 10) + (i / 10);
            for (int j = 0; j <= minute; j++) {
                if (j == reversHour) {
                    count++;
                }
            }
        }
        System.out.println("Число зеркальных чисел: " + count);
    }
}

