package workforme.massive;

/*
Найти сумму цифр массива
 */
public class Task3 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5,6};
        int sum = 0;
        for (int i : mass) {
            sum += i;
        }
        System.out.print("Sum: " + sum);
    }
}
