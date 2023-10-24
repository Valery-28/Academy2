package workforme.massive;
/*
Создать двумерный квадратный массив размера n. Заполнить его случайными числами таким образом:
○	числа по диагонали равны 0;
○	вверху и снизу от пересечения диагоналей находятся только положительные числа;
○	слева и справа от пересечения диагоналей находятся только отрицательные числа;
○	Вывести массив на экран.
○	Найти сумму всех элементов
○	Найти среднее арифметическое всех элементов, которые больше суммы всех элементов
Пример:
 0  4  5  5  3  8  0
-2  0  5  6  3  0 -4
-2 -8  0  6  0 -1 -2
-5 -9 -2  0 -9 -7 -3
-6 -2  0  1  0 -1 -5
-2  0  3  5  2  0 -8
 0  4  2  9  1  3  0

сумма всех элементов: -3
среднее арифметическое всех элементов больше -3: 1.6579
 */

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(3, 8);
        int[][] array = new int[n][n];
        int i;
        int j;
        int sum = 0;
        int count = 0;
        double average = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                array[i][j] = rand.nextInt(-9, 9);
                if (i == j) {
                    array[i][j] = 0;
                } else if (i > j) {
                    array[i][j] = rand.nextInt(-9, -1);
                } else {
                    array[i][j] = rand.nextInt(1, 9);
                }
                    if (array[i][j] >= 0) {
                        System.out.print(" " + array[i][j] + " ");
                    } else {
                        System.out.print(array[i][j] + " ");
                    }
                    sum += array[i][j];
                }
                System.out.println();
            }
            System.out.println("Сумма всех элементов: " + sum);
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    if (array[i][j] > sum) {
                        count++;
                        average += array[i][j];
                    }
                }
            }
            if (count == 0) {
                System.out.println("В матрице нет элемнтов, которые были бы больше суммы всех элементов матрицы!");
                return;
            }
            average = average / count;
            System.out.println("среднее арифметическое всех элементов больше " + sum + ": " + average);
        }
    }

