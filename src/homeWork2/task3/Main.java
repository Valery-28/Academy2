package homeWork2.task3;

/*
Задача 3:
Необходимо создать класс который имеет метод чтобы накапливать 5 последних переданных
в него цифровых значений. Так же необходимо создать метод который выводит
среднее из накопленных значений.
 */
public class Main {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume(1);
        consumer.consume(2);
        consumer.consume(3);
        consumer.consume(4);
        consumer.consume(5);
        System.out.println(consumer.avg());
        consumer.consume(6);
        consumer.consume(7);
        System.out.println(consumer.avg());
    }
}
