package workforme.cycle;
/*

17) Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на    картинке ниже.
*
* *
* * *
* * * *
* * * * *

 */
public class Task4 {
    public static void main(String[] args) {
        String s=" * ";
        for(int a = 0; a <= 4;a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(s);
                if(b == a){
                    System.out.print("\n");
                }
            }
        }
    }
}

