package homeWorks.homeWork4.task4.app;
/*
Необходимо реализовать программу "калькулятор".
Поддерживаемые операции +-/* выбор операции и ввод данных
осуществляется пользователем с клавиатуры.
 */
import homeWorks.homeWork4.task4.exception.CustomException;
import homeWorks.homeWork4.task4.calculate.Calculate;

public class Main {
    public static void main(String[] args) throws CustomException {
        Calculate calculate = new Calculate();
        calculate.calculateStart();

    }
}
