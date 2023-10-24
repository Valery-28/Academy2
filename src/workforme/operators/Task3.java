package workforme.operators;

import java.util.Scanner;

/*
По порядковому номеру пальца руки необходимо вывести его название на экран.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number finger: ");
        int fingerNumber = sc.nextInt();
        switch (fingerNumber) {
            case 1 -> System.out.println("Большой");
            case 2 -> System.out.println("Указательный");
            case 3 -> System.out.println("Средний");
            case 4 -> System.out.println("Безымянный");
            case 5 -> System.out.println("Мезинец");
            default -> System.out.println("Такого пальца нет");
        }
    }
}
