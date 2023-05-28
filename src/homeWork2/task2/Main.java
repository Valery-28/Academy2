package homeWork2.task2;

/*
Задача с классом Box(x,y,z)
Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
1) Куб (Все стороны равны).
2) Обычная коробка.
3) Конверт (Есть только длинна и ширина)
 */
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5, 5, 5);
        Box box2 = new Box(2, 4, 0);
        Box box3 = new Box(1, 2, 5);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

    }
}
