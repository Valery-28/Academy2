package workforme.massive;

/*
Найти максимальный из элементов массива с четными индексами
 */
public class Task4 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 9, 10, 23};
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                if (max < mass[i]) {
                    max = mass[i];
                }
            }
        }
        System.out.println("Максимальное число четного индекса: " + max);
    }
}
