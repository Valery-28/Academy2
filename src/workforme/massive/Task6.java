package workforme.massive;

import java.util.Arrays;

/*
Разложить положительные и отрицательные числа по разным массивам
 */
public class Task6 {
    public static void main(String[] args) {
        int[] mas = {-1, -2, -3, -4, 5, 0, 1, 2, 3, 4};
        int[] masS = new int[mas.length];
        int[] masP = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                masS[i] = mas[i];
            } else if (mas[i] > 0) {
                masP[i] = mas[i];
            }
        }
        System.out.println("Исходный:" + Arrays.toString(mas));
        System.out.println("Отрицательный: " + Arrays.toString(masS));
        System.out.println("Положительный: " + Arrays.toString(masP));
    }
}
