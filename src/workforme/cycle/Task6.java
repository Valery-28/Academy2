package workforme.cycle;
/*
Найдите самую большую цифру числа, а также ее индекс
 */

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt();
        System.out.println("Ваше число: " + n);
        int s;
        int max = 0;
        int index = 0;
        if (n < 0) {
            n = n * (-1);
        }
        for (int i = 1; i <= n; i++) {
            s = n % 10;
            n = n / 10;
            if (s > max) {
                max = s;
                index = i;
            }
        }
        System.out.println("Индекс максимального значения: " + index);
        System.out.println("Максимальное значени: " + max);
    }
}