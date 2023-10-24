package workforme.datatype;

import java.util.Random;

/*
Найти сумму цифр ab + cd числа abcd
 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int abcd =  random.nextInt(-9999,9999);
        int cd = abcd % 100;
        int ab = abcd / 100;
        System.out.println(abcd);
        if (abcd >= 1000 || abcd <= -1000) {
            System.out.println(ab + cd);
        } else {
            System.out.println("number not (-9999 - (-1000)) or (1000 - 9999)");
        }
    }
}
