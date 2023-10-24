package workforme.operators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        double rAB = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
        System.out.println(rAB);
        System.out.print("Enter r: ");
        double r = scanner.nextDouble();
        if (r >= rAB) {
            System.out.println("closed");
        } else {
            System.out.println("not closed");
        }
    }
}