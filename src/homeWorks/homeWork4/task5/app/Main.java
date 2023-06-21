package homeWorks.homeWork4.task5.app;
/*
Необходимо написать программу считающую сумму и разность двух
квадратных матриц. Пользователь вводит матрицы с клавиатуры.
 */
import homeWorks.homeWork4.task5.exception.CustomException;
import homeWorks.homeWork4.task5.matrix.Matrix;

public class Main {
    public static void main(String[] args) throws CustomException {
        Matrix matrix =new Matrix();
        matrix.generateMatrix();
    }
}
