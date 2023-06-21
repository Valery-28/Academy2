package homeWorks.homeWork4.task9;



import homeWorks.homeWork4.task9.box.Box;

import java.io.*;
import java.util.ArrayList;

/*
9-10
Создать класс коробка (Box(x,y,z)). Создать 5 объектов. Сериализовать их в файл.
Десериализовать объекты из задания #9. Отсортировать их по объёму.
Вывести на экран. Записать в файл (OUTPUT) самый большой объем.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Box>boxes=new ArrayList<>();
        boxes.add(new Box(1, 2, 3));
        boxes.add(new  Box(2, 5, 3));
        boxes.add(new Box(3, 6, 3));
        boxes.add(new Box(4, 7, 1));
        boxes.add (new Box(1, 9, 8));

        try (FileOutputStream fos = new FileOutputStream(
                "D:\\2chance\\Academy\\src\\classWorks\\lesson12\\task3\\example");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(boxes);
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
        ArrayList<Box> newBoxes;
        try (FileInputStream fis = new FileInputStream(
                "D:\\2chance\\Academy\\src\\classWorks\\lesson12\\task3\\example");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            newBoxes = (ArrayList<Box>) ois.readObject();
            System.out.println(newBoxes);
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }
}
