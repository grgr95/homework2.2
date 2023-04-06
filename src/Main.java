public class Main {
    public static void main(String[] args) {
        /*если клиент пополняет счет больше, чем на 950 рублей,*/
        /*то оператор дарит ему по 1 рублю за каждые полные 100 рублей*/

        int bonusScale = 100;
        int initialBalance = 100;
        int amountDeposit = 980;
        int bonus;

        if (amountDeposit >= 950) {
            bonus = amountDeposit / bonusScale;;
        } else {
            bonus = 0;
        }
        System.out.println("Счет клиента:" + (initialBalance + amountDeposit + bonus) + "рублей");
        System.out.println("Ваш бонус составил:"+ bonus +"рублей");
    }
}
