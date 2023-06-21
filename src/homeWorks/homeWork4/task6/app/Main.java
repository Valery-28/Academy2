package homeWorks.homeWork4.task6.app;
/*
Необходимо написать программу считающую сумму и разность двух
квадратных матриц. Пользователь вводит матрицы с клавиатуры.
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String fileName = "D:\\2chance\\Academy\\src\\homeWorks\\homeWork4\\task6\\INPUT";
        int matrixWidth;
        int matrixHeight;
        int[][] matrix1;
        int[][] matrix2;
        int[][] sumMatrix;
        int[][] subtractionMatrix;
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            matrixWidth = scanner.nextInt();
            matrixHeight = scanner.nextInt();
            sumMatrix = new int[matrixWidth][matrixHeight];
            subtractionMatrix = new int[matrixWidth][matrixHeight];
            matrix1 = new int[matrixWidth][matrixHeight];

            for (int i = 0; i < matrixHeight; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            matrix2 = new int[matrixHeight][matrixWidth];
            for (int i = 0; i < matrixHeight; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            printMatrix(matrix1);
            System.out.println();
            printMatrix(matrix2);
            differenceMatrix(subtractionMatrix,matrix1,matrix2);
            sumMatrix(sumMatrix,matrix1,matrix2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sumMatrix(int [][] sumMatrix, int[][] firstMatrix, int[][]secondMatrix){
        System.out.println("Сумма матриц: ");
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void differenceMatrix(int[][] subtractionMatrix, int[][] firstMatrix, int[][]secondMatrix ){

        System.out.println("Разница матриц: ");
        for (int i = 0; i < subtractionMatrix.length; i++) {
            for (int j = 0; j < subtractionMatrix[i].length; j++) {
                subtractionMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
                System.out.print(subtractionMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row :
                matrix) {
            for (int val :
                    row) {
                System.out.print(val);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
