package workforme.cycle;

import java.util.Random;

/*
Создайте программу, вычисляющую факториал натурального числа n
 */
public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        long number = rand.nextInt(0,25);
        System.out.println("Your number: " + number);
        long factorial = 1;
        if (number == 0) {
            number=factorial;
        }
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial this number: " + factorial);
    }
}
