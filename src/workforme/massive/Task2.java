package workforme.massive;
/*
Найти минимальное значение из массива
 */
public class Task2 {
    public static void main(String[] args) {
        int[] mass = {15, 2, 3, 4, 7, 3, 5, 1};
        int min = mass[0];
        for (int j : mass) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Min number: " + min);
    }
}
