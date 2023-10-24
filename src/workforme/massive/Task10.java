package workforme.massive;

import java.util.Random;

/*
 Найти строку матрицы с максимальной суммой элементов
 */
public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mas = new int[5][5];
        int sum = 0;
        int sumMax = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(0, 9);
                sum += mas[i][j];
                System.out.print(" " + mas[i][j] + " ");
            }
            System.out.println();
            if (sum > sumMax) {
                sumMax = sum;
            }
            sum = 0;
        }
        System.out.println("Maximal sum: " + sumMax);
    }
}
