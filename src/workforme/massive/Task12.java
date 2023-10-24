package workforme.massive;

import java.util.Random;

/*
Сделать транспонирование матрицы (замена строк на столбцы)
 */
public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mas = new int[5][5];
        int[][]masR=new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(0, 9);
                System.out.print(" " + mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                masR[i][j] = mas[j][i];
                System.out.print(" " + masR[i][j] + " ");
            }
            System.out.println();
        }
    }
}