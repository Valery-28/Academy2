package class_works.hw;


/*
Создать двумерный квадратный массивный размер n. Заполните его случайными числами таким образом:

числа по диагонали равны 0;
вверх и ближе к пересечению диагоналей обнаруживают только положительные числа ( > 0);
слева и справа от пересечения диагоналей обнаруживаются только отрицательные числа ( < 0);
Вывести массив на экран.

Найти состав всех элементов;
Найти среднее арифметическое всех элементов, которое больше суммы всех элементов ;

 */
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(3, 6);
        int[][] array = new int[n][n];
        int sum = 0;
        double average = 0;
        int count = 0;
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                array[i][j] = rand.nextInt(-9, 9);
                if (i == j) {
                    array[i][j] = 0;
                }
                if (i < j && array[i][j] <= 0) {
                    array[i][j] = rand.nextInt(1, 9);
                } else if (i > j && array[i][j] >= 0) {
                    array[i][j] = rand.nextInt(-9, -1);
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
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (sum < array[i][j]) {
                    count++;
                    average += array[i][j];
                }
            }
        }

        average = average / count;
        System.out.println("Сумма всех чисел в матрице: " + sum);
        if (count == 0) {
            System.out.println("Чисел больше суммы нет");
            return;
        }
        System.out.println("Среднее арифметическое всех элементов больше " + sum + ": " + average);
    }
}

