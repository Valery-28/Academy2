package homeWorks.homeWork4.task1;
/*
1
Необходимо реализовать программу, которая будет бесконечно
считывать строки введенные пользователем и выводить их в консоль.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the string: ");
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
        }
    }
}
