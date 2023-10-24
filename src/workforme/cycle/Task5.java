package workforme.cycle;

import java.util.Random;

/*
Найдите сумму и произведение цифр числа
 */
public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 100000);
        System.out.println("Ваше число: " + n);
        int s = 0, m = 1;
        for (int i = 0; i <= n; i++) {
            if (n % 10 != 0) {
                m *= n % 10;
                s += n % 10;
            }
            n /= 10;
        }
        if (n != 0) {
            m = m * n;
            s = s + n;
        }
        System.out.println("Сумма: " + s);
        System.out.println("Произведение: " + m);
    }
}
