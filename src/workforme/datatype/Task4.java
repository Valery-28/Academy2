package workforme.datatype;

import java.util.Random;

/*
Вывести длину отрезка, проходящей через две точки
 */
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int firsPoint = random.nextInt(-10,100);
        int secondPoint = random.nextInt(-10,100);
        int result = firsPoint - secondPoint;
        if (result < 0) {
            result = result - (result * 2);
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
