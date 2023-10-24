package workforme.massive;
/*
Найти минимальный из элементов массива с нечетными индексами
 */
public class Task5 {
    public static void main(String[] args) {
        int[] mass = {12, 2, 3, 1, 5, 6, 1, 7, 9, 10, 23};
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {
                if (min > mass[i]) {
                    min = mass[i];
                }
            }
        }
        System.out.println("Миксимальное число нечетного индекса: " + min);
    }
}
