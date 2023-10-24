package workforme.massive;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)


 */
public class Task7 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 1, 1, 2, 1, 3, 3,5,5,6,67,8,8,8,9,9,9};
        int[] b = new int[a.length];
        int curIndex = 0;
        for (int i: a) {
            if (IntStream.range(0, curIndex).noneMatch(num -> b[num] == i)) {
                b[curIndex++] = i;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(b, curIndex)));
    }
}

