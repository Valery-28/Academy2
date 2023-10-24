package workforme.massive;

/*
Найти максимальное значение из массива
 */
public class Task1 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 7, 3, 5, 10};
        int max = 0;
        for (int j : mass) {
            if (max <= j) {
                max = j;
            }
        }
        System.out.println("Max number: " + max);
    }
}
