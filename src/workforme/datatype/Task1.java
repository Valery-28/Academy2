package workforme.datatype;

import java.util.Random;

/*
Вывести последнюю цифру числа любого числа
 */
public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();
        int result = number % 10;
        System.out.println(number);
        if (result <= 0) {
            result = result - (result * 2);
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
