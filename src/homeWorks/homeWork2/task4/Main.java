package homeWorks.homeWork2.task4;

/*
Необходимо реализовать класс Car,  который имеет поля марка и цвет.

Марки имеют следующие цвета:
Audi - Синий. Красный. Зеленый
BMW - Оранжевый. Черный. Фиолетовый
KIA -  Желтый. Cерый. Белый

Ожидается метод который изметяет цвет.
Как параметр принимает строку, если цвет не верный
то ничего не изменяет.
 */

public class Main {
    public static void main(String[] args) {
        Car audiFirstCar = new Car("Audi");
        Car kiaFirstCar = new Car("KIA");
        Car bmwFirstCar = new Car("BMW");
        audiFirstCar.setColor("Blue");
        audiFirstCar.print();
        audiFirstCar.setColor("Black");
        audiFirstCar.print();
        audiFirstCar.setColor("Red");
        audiFirstCar.print();
        kiaFirstCar.setColor("Yelow");
        kiaFirstCar.print();
        kiaFirstCar.setColor("Purple");
        kiaFirstCar.print();
        kiaFirstCar.setColor("White");
        kiaFirstCar.print();
        bmwFirstCar.setColor("Black");
        bmwFirstCar.print();
        bmwFirstCar.setColor("Grey");
        bmwFirstCar.print();
        bmwFirstCar.setColor("Purple");
        bmwFirstCar.print();
    }
}

