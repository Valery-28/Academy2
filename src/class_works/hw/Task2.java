package class_works.hw;

import java.util.Scanner;

/*
Улитка поднимается по дереву на a футах в день. Затем каждую ночь улитка сползает на b фут. Высота дерева — h фут.

Напишите программе с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.

Если улитка не может добраться до вершины дерева, следует сделать вывод сообщение: Невозможно.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите насколько улитка поднимается по дереву в день a: ");
        int a = scanner.nextInt();
        System.out.print("Введите насколько улитка сползает вниз за ночь b: ");
        int b = scanner.nextInt();
        System.out.print("Введите высоту дерева h: ");
        int h = scanner.nextInt();
        int count = 0;
        if (a <= b && a < h) {
            System.out.println("Улитка никогда не забертся на вершину дерева");
            return;
        }
        while (h >= 0) {
            count++;
            h = h - a;
            if (h <= 0) {
                System.out.println("Количество дней: " + count);
                break;
            }
            h = h + b;
        }
        scanner.close();
    }
}
