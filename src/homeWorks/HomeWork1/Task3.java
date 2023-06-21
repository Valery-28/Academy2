package homeWorks.HomeWork1;
/*
Задание 3
Дан некоторый массив "int[] array", необходимо инвертировать его.
 */

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int massiveRow = rand.nextInt(0, 20);
        int[] array = new int[massiveRow];
        for (int element = 0; element < array.length; element++) {
            array[element] = rand.nextInt(0, 50);
        }
        System.out.println(Arrays.toString(array));

        for (int element = 0; element < array.length / 2; element++) {
            int temp = array[element];
            array[element] = array[array.length - element-1];
            array[array.length - element - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
