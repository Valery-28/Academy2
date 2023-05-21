package HomeWork1;
/*
Задание 4
    Дан некоторый двумерный массив "int[][] matrix". Нужно определить каких чисел
    в нем больше, положительных или отрицательных.
 */

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int countP = 0;
        int countM = 0;
        int countNull = 0;
        int[][] matrix = new int[5][5];
        for (int firstMas = 0; firstMas < matrix.length; firstMas++) {
            for (int secondMas = 0; secondMas < matrix.length; secondMas++) {
                matrix[firstMas][secondMas] = rand.nextInt(-10, 10);
                if (matrix[firstMas][secondMas] < 0) {
                    countM++;
                } else if (matrix[firstMas][secondMas] > 0) {
                    countP++;
                } else if (matrix[firstMas][secondMas] == 0) {
                    countNull++;
                }
            }
        }

        System.out.println("two-dimensional array: " + Arrays.deepToString(matrix));
        System.out.println("Null: " + countNull);
        System.out.println("Plus: " + countP);
        System.out.println("Minus: " + countM);

        if (countNull > countP && countNull > countM) {
            System.out.println("В данном двумерноммассиве больше всего нулей и их количество = " + countNull);
            return;
        }
        if (countP > countM) {
            System.out.println("В данном двумерноммассиве больше всего положительных чисел и их количетсво = " + countP);
        }
        if (countP < countM) {
            System.out.println("В данном двумерноммассиве больше всего отрицательных чисел и их количетсво = " + countM);
        }
        if (countP == countM) {
            System.out.println("Ну... тут у нас паритет!");
        }

    }
}

