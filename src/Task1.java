import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите своё имя: ");
        String name = sc.next();
        System.out.print("Введите возраст: ");
        int age = sc.nextInt();
        System.out.print("Введите дату рождения: ");
        String date = sc.next();
        System.out.println("Ну здравстувуй " + name + " " + date + " " + age+" лет");
    }
}
