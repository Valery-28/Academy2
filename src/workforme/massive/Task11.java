package workforme.massive;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать
 1. При перевороте элементов не желательно создавать еще один массив
 */
public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for(int i = 0; i<array.length;i++){
            array[i]=random.nextInt(0,9);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
