package HomeWork1;

import java.util.Arrays;

/*
Задание 6
Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
сумму и разности.
 */
public class Task6 {
    public static void main(String[] args) {
        int i;
        int j;
        int[][] array1 = {{2, 12, 32, 23, 2}, {12, 23, 23, 24, 32},
                {1, 23, 234, 45, 54}, {12, 23, 24, 34, 55}
        };
        int[][] array2 = {{54, 123, 332, 253, 22}, {122, 253, 273, 2984, 92},
                {1, 2, 25, 42, 54}, {0, 23, 24, 34, 235}
        };
        int difference;
        int sum;
        System.out.println("difference: ");
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array1.length; j++) {
                difference = array1[i][j] - array2[i][j];
                System.out.print(difference + " ");
            }
            System.out.println();

        }
        System.out.println("Sum: ");
        for (i = 0; i < array2.length; i++) {
            for (j = 0; j < array2.length; j++) {
                sum = array1[i][j] + array2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}

