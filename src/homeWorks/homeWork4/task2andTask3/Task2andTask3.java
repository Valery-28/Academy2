package homeWorks.homeWork4.task2andTask3;
/*
2
Необходимо реализовать программу, которая будет считывать
числа (целые), введенные пользователем, пока пользователь
не введет "stop" слово. После чего программа выведет среднее
из всех введенных значений.по команде "status" необходимо вывести введенные
цифры в отсортированном виде (от меньшего к большему).
 */

import homeWorks.homeWork4.task2andTask3.exeption.CustomException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2andTask3 {
    public static void main(String[] args) throws Exception {
        ArrayList<Long> statistic = new ArrayList<>();
        System.out.println("""
                In this program, integers are entered. There are also two commands:
                stop: will stop the program.
                status: will sort the entire input list""");
        System.out.println("Let's start!");
        String enterStop = "stop";
        String enterStatus = "status";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNext(enterStatus)) {
                Collections.sort(statistic);
                System.out.println("Number sort: " + statistic);
                System.out.print("Enter an integer: ");
                scanner.next();
            }
            if (scanner.hasNext(enterStop)) {
                long sum = 0;
                long average = 0;
                for (long meaning : statistic) {
                    sum += meaning;
                    average = sum / statistic.toArray().length;
                }
                System.out.printf("You stopped program. Sum: %s. Average: %s", sum, average);
                break;
            } else if (!scanner.hasNextLong()) {
                throw new CustomException("Entered not a number or not an integer or maybe you wrong write command."
                        + "Restart program");
            } else if (scanner.hasNext()) {
                statistic.add(scanner.nextLong());
            }
        }
    }
}
