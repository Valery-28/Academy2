package workforme.massive;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Выполнить слияние 2 упорядоченных массивов
 */
public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scan.nextInt();
        int[] masFirst = new int[n];
        int[] masTwo = new int[n];
        int[] masThree = new int[n];
        for (int i = 0; i < masFirst.length; i++) {
            masFirst[i] = random.nextInt(0, 10);
        }

        System.out.println("First massive before sort : " + Arrays.toString(masFirst));
        Arrays.sort(masFirst);
        System.out.println("First massive after sort : " + Arrays.toString(masFirst));

        for (int i = 0; i < masTwo.length; i++) {
            masTwo[i] = random.nextInt(0, 10);
        }

        System.out.println("Second massive before sort: " + Arrays.toString(masTwo));
        Arrays.sort(masTwo);
        System.out.println("Second massive after sort : " + Arrays.toString(masTwo));

        for (int i = 0; i < masThree.length; i++) {
            masThree[i] = masFirst[i] + masTwo[i];
        }

        System.out.println("Three massive: " + Arrays.toString(masThree));
    }
}
