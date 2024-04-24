public class Main {
    public static void main(String[] args) {

        int customerCheck = 100;
        ;
        int bonusVolue = 100;
        ;
        int addMoney = 1500;
        ;
        int bonus;
        if (addMoney >= 1000) {
            bonus = addMoney / bonusVolue;;
        } else {
            bonus = 0;;
        }
        int totalCheck = customerCheck + addMoney + bonus;;


        System.out.println("Вы пополнили счет на" + addMoney + "руб.");
        System.out.println("Ваш бонус составил" + bonus + "руб.");
        System.out.println("Ваш баланс" + totalCheck + "руб.");
    }
}