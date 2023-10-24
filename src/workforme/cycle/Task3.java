package workforme.cycle;

/*
Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на   картинке ниже.
* * * * *
* * * * *
* * * * *

 */
public class Task3 {
    public static void main(String[] args) {
        String s=" * ";
        for(int a = 0; a <= 2;a++) {
            for (int b = 0; b <= 4; b++) {
                System.out.print(s);
                if(b == 4){
                    System.out.print("\n");
                }
            }
        }
    }
}
