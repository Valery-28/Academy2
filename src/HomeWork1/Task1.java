package HomeWork1;
/*
Задание 1
Есть некоторый массив, состоящий из целых чисел "int[] array", есть некоторое
число "n". Необходимо посчитать сумму всех элементов массива, однако если в
массиве встречается число "n" то в сумму его включать не нужно.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int sum = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 10); //Выбран такой диапазон для возможномти проверки всех условий задачи
        }
        System.out.println("Наш массив: " + Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            if (array[j] == n) {
                array[j] = 0;
            }
            sum += array[j];
        }
        System.out.println("Сумма нашего массива: " + sum);
        sc.close();
    }
}
