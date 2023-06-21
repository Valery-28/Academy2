package homeWorks.HomeWork1;
/*
Задание 5
Дан некоторый двумерный массив "int[][] matrix". Нужно определить является ли он нижней
треугольной матрицей или же нет.
 */

public class Task5 {
    public static void main(String[] args) {
        int fitstM;
        int secondM;
        int count;
        int sum = 0;
        int[][] matrix = {{1, 23, 34, 66, 45}, {0, 56, 45, 77, 34},
                {0, 0, 5, 43, 65}, {0, 0, 0, 8, 35}, {0, 0, 0, 0, 21}};
        for (fitstM = 0; fitstM < matrix.length; fitstM++) {
            for (secondM = 0; secondM < matrix.length; secondM++) {
                System.out.print(matrix[fitstM][secondM] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (fitstM = 1; fitstM < matrix.length; fitstM++) {
            for (secondM = 0; secondM <= fitstM - 1; secondM++) {
                System.out.print(matrix[fitstM][secondM] + " ");
                count = matrix[fitstM][secondM];
                sum += count;
            }
            System.out.println();
        }
        if (sum == 0) {
            System.out.println("matrix treangulate");
        } else {
            System.out.println("matrix not treangulate");
        }
    }
}
