// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int summ = 100;
        int moreMoney = 800;
        int accountSumm = summ + moreMoney;
        if (accountSumm > 1000) {
            int bonus = moreMoney / 100;
            int presentAccountSumm = accountSumm + bonus;
            System.out.println(bonus);
            System.out.println(presentAccountSumm);
        }
        else {
            System.out.println("No bonus");
            System.out.println(accountSumm);
        }
    }
}