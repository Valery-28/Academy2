package workforme.cycle;

import java.util.Random;

/*
Целого числа определить является ли это число простым
 */
public class Task11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberCount;
        int sum = 0;
        String yes = " ";
        String no = " ";
        int number = rand.nextInt(0, 100);
        System.out.println("Ваш номер: " + number);
        for (int i = 0; i <= number; i++) {
            numberCount = number % 10;
            number = number / 10;
            sum += numberCount;
        }
        System.out.println("Сумма чисел равна: "+sum);
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                no = "no";
                break;
            }
            yes = "yes";
        }
        if (no.equals("no")) {
            System.out.println("Число не простое");
        } else if (yes.equals("yes")){
            System.out.println("Число простое");
        }
    }
}