package homeWorks.homeWork4.task5.matrix;

import homeWorks.homeWork4.task5.exception.CustomException;

import java.util.Scanner;

public class Matrix {

    public Matrix() {
    }

    public void generateMatrix() throws CustomException {
        Scanner scanner = new Scanner(System.in);
        int postMatrix;
        int rowMatrix;
        int[][] firstMatrix;
        int[][] secondMatrix;
        int[][] subtractionMatrix;
        int[][] sumMatrix;

        System.out.print("Количество столбцов в матрицах: ");
        postMatrix = scanner.nextInt();
        if (postMatrix <= 0) {
            throw new CustomException("Столбец не может быть меньше или равен 0!");
        }
        System.out.print("Количество строк в матрицах: ");
        rowMatrix = scanner.nextInt();
        if (rowMatrix <= 0) {
            throw new CustomException("Ряд не может быть меньше или равен 0!");
        }
        if (postMatrix != rowMatrix) {
            throw new CustomException("Матрицы не квадратные! Квадратные значит, что количество рядов" +
                    " = количетву столбцов. Попробуй снова!");
        } else {
            firstMatrix = new int[postMatrix][rowMatrix];
            secondMatrix = new int[postMatrix][rowMatrix];
            subtractionMatrix = new int[postMatrix][rowMatrix];
            sumMatrix = new int[postMatrix][rowMatrix];
        }
        System.out.println("Вводим значение первой матрицы:");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (!scanner.hasNextInt()) {
                    throw new CustomException("Введи число! ЦЕЛОЕ ЧИСЛО!");
                } else {
                    firstMatrix[i][j] = scanner.nextInt();
                    System.out.print(firstMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Вводим значение второй матрицы:");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                if (!scanner.hasNextInt()) {
                    throw new CustomException("Введи число! ЦЕЛОЕ ЧИСЛО!");

                } else {
                    secondMatrix[i][j] = scanner.nextInt();
                    System.out.print(secondMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        sumMatrix(sumMatrix, firstMatrix, secondMatrix);
        differenceMatrix(subtractionMatrix, firstMatrix, secondMatrix);
    }

    public void sumMatrix(int[][] sumMatrix, int[][] firstMatrix, int[][] secondMatrix) {
        System.out.println("Сумма матриц: ");
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void differenceMatrix(int[][] subtractionMatrix, int[][] firstMatrix, int[][] secondMatrix) {
        System.out.println("Разница матриц: ");
        for (int i = 0; i < subtractionMatrix.length; i++) {
            for (int j = 0; j < subtractionMatrix[i].length; j++) {
                subtractionMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
                System.out.print(subtractionMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
