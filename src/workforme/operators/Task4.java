package workforme.operators;

import java.util.Scanner;

/*
Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год.
    Пример: 15 3 2000 -> 16 3 2000
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        if (day < 1 | day > 31) {
            System.out.println("Day false!");
            return;
        }
        System.out.print("Enter mount: ");
        int mount = sc.nextInt();
        if (mount < 1 | mount > 12) {
            System.out.println("Mount false!");
            return;
        }
        if(day==31&& mount ==4||mount == 6 || mount == 9 || mount == 11){
            System.out.println("Mount false!");
            return;
        }
        if(day==30| day ==31&& mount ==2){
            System.out.println("Mount false!");
            return;
        }
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 0) {
            System.out.println("Year false!");
            return;
        }
        System.out.println("Were: " + day + " " + mount + " " + year);
        day++;
        if (day == 32) {
            day = 1;
            mount++;
        }
        if (day == 31 && mount != 1 && mount != 3 && mount != 5 && mount != 7 && mount != 8 && mount != 10 && mount != 12) {
            day = 1;
            mount++;
        }

        if (day == 30 && mount == 2 && year % 4 == 0) {
            day = 1;
            mount++;
        }
        if (day == 29 && mount == 2 && year % 4 != 0) {
            day = 1;
            mount++;
        } else if (day == 30 && mount == 2) {
            System.out.println("Такого дня не существует");
            return;
        }
        if (mount == 13) {
            mount = 1;
            year++;
        }
        System.out.println("Now: " + day + " " + mount + " " + year);
    }
}
