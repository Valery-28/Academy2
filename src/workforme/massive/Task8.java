package workforme.massive;

/*
Найти максимальный и минимальные элементы массива и вывести их индексы на экран
 */
public class Task8 {
    public static void main(String[] args) {
        int[] mass = {15, 2, 3, 4, 77, -3, 5, 1};
        int min = mass[0];
        int max = 0;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
                indexMin = i;
            } else if (max < mass[i]) {
                max = mass[i];
                indexMax = i;
            }
        }
        System.out.println("Min number: " + min + " index: " + indexMin);
        System.out.println("Max number: " + max + " index: " + indexMax);
    }
}
