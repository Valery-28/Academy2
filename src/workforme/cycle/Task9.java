package workforme.cycle;

/*
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
«Счастливым» считается билетик у которого сумма первых трёх цифр номера равна
сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
Трамвайное депо решило подарить сувенир обладателю каждого
счастливого билета и теперь раздумывает, как много сувениров потребуется.
С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */

public class Task9 {
    public static void main(String[] args) {
        int numberTalon = 999999;
        int upHalf;
        int upNumber;
        int downNumber;
        int sumUpHalf = 0;
        int sumDownHalf = 0;
        int downHalf;
        int countBuyTrophy = 0;
        for (int i = 0; i <= numberTalon; i++) {
            upHalf = i / 1000;
            downHalf = i % 1000;
            for (int j = 1; j <= 3; j++) {
                upNumber = upHalf % 10;
                downNumber = downHalf % 10;
                upHalf = upHalf / 10;
                downHalf = downHalf / 10;
                sumUpHalf += upNumber;
                sumDownHalf += downNumber;
            }
            if (sumUpHalf == sumDownHalf) {
                countBuyTrophy++;
            }
            sumUpHalf = 0;
            sumDownHalf = 0;
        }
        System.out.println("С 999999 билетов вам потребуется заупить: " + countBuyTrophy + " призов");
    }
}

