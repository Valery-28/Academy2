package workforme.datatype;

import java.util.Scanner;

/*
 Имеется прямоугольное отверстие размера a на b. Определить можно ли полностью закрыть отверстие
 круглой картонкой радиусом r. Пример:6, 8, 5. Картонка с радиусом 5 закрывает полностью отверстие
 размера 6 * 8

 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        double rAB = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2))) / 2;
        System.out.print("Enter r: ");
        double r = scanner.nextDouble(); 
        if (r == rAB | r >= rAB) {
            System.out.println("closed");
        } else {
            System.out.println("not closed");
        }
    }
}
