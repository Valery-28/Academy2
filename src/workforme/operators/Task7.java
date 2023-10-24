package workforme.operators;

import java.util.Random;

/*
Создать программу, которая будет находить вещественные корни квадратного уравнения ax²+bx+c=0,
либо сообщать, что корней нет.
 */
public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        double a = random.nextInt(-5, 5);
        double b = random.nextInt(-5, 5);
        double c = random.nextInt(-5, 5);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        double d = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Дискременант равен: " + d);
        double x1;
        double x2;
        if (d > 0 && a != 0) {
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("Имеет два корня, первый: " + x1 + " второй: " + x2);
        } else if (d == 0 && a != 0) {
            x1 = -b / (a * 2);
            System.out.println("Имеет один корень: " + x1);
        } else if (d < 0) {
            System.out.println("Нет корней");
        }
    }
}
