package homeWorks.homeWork4.task4.calculate;

import homeWorks.homeWork4.task4.exception.CustomException;

import java.util.Scanner;

public class Calculate {
    Scanner scanner = new Scanner(System.in);

    public Calculate() {
    }

    public void calculateStart() throws CustomException {
        System.out.print("Введите X = ");
        int x = scanner.nextInt();
        System.out.print("Введите Y = ");
        int y = scanner.nextInt();
        System.out.println("""
                Операцию, которык можно произвести с числами:\s
                1)division\s
                2)multiplication
                3)subtraction\s
                4)sum""");
        System.out.print("Выберите операцию записав пункт из списка указанного выше: ");
        int number = scanner.nextInt();
        if (number < 1 || number > 4) {
            throw new CustomException("Не верное число. Выберите число из списка т.е. от 1 до 4!");

        } else {
            switch (number) {
                case 1 -> System.out.println(x + "/" + y + " = " + division(x, y));
                case 2 -> System.out.println(x + "*" + y + " = " + multiplication(x, y));
                case 3 -> System.out.println(x + "-" + y + " = " + subtraction(x, y));
                case 4 -> System.out.println(x + "+" + y + " = " + total(x, y));
            }
        }
    }


    public double division(double x, double y) throws CustomException {
        double divisionXY;
        if (x == 0 || y == 0) {
            throw new CustomException("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
        }
        divisionXY = x / y;
        return divisionXY;
    }

    public long multiplication(int x, int y) {
        long multiplication;
        multiplication = (long) x * y;
        return multiplication;
    }

    public int subtraction(int x, int y) {
        int subtraction;
        subtraction = x - y;
        return subtraction;
    }

    public int total(int x, int y) {
        int total;
        total = x + y;
        return total;
    }
}
