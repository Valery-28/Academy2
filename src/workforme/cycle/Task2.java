package workforme.cycle;
/*
Необходимо вывести на консоль такую последовательность чисел:
1 2 4 8 16 32 64 128 256 512
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        double result;
        for(int i=0;i<=23;i++){
            result = Math.pow(a,i);
            System.out.println(result);
        }
    }
}
