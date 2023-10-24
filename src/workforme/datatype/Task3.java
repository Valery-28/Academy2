package workforme.datatype;

import java.util.Random;

/*
Вывести 3юю цифру 5ти-значного числа
 */
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number =  random.nextInt(-99999,99999);
        int result;
        System.out.println(number);
        if (number >= 10000 || number <= -10000) {
            result = number/100;
            result = result%10;
            if(result<0){
                result = result - (result * 2);
            }
            System.out.println(result);
        } else {
            System.out.println("number not (-99999 - (-10000)) or (10000 - 99999)");
        }
    }
}
