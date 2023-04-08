public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int bonusScale = 100;
        int uploadVolume = 1100;
        int bonus;

        if (uploadVolume >= 1000){
            bonus = uploadVolume / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount = customerAccount + uploadVolume + bonus;

        System.out.println("Вы пополнили счёт на " + uploadVolume + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAccount + " руб.");
    }
}
