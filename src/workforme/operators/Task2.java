package workforme.operators;

import java.util.Scanner;

/*
Определить является ли целое число чётным или нечётным
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
        scanner.close();
    }
}
