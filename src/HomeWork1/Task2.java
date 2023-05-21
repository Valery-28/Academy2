package HomeWork1;

/*
Задание 2
Необходимо найти сумму всех четных чисел в последовательности Фибоначи, до определенного индекса "n".
Например:
    Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
    n = 7
    Сумма всех четных до 7го.  равна 2 + 8 = 10.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number0 = 0;
        long number1 = 1;
        long number2;
        long sum = 0;
        System.out.print("Введите индекс: ");
        int indexN = sc.nextInt();
        System.out.print(number0 + " " + number1 + " ");
        for (int i = 2; i <= indexN; i++) {
            number2 = number0 + number1;
            System.out.print(number2 + " ");
            number0 = number1;
            number1 = number2;
            if (number1 % 2 == 0) {
                sum += number2;
            }
        }
        System.out.println();
        System.out.println("Сумма ровна: " + sum);
        sc.close();
    }
}

