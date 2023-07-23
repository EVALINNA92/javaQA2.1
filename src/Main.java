// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int start = 58;
        int amount = 1303;
        int balance = amount + start;
        if (amount > 1000) {
            int bonus = amount / 100;
            System.out.println(bonus);
            System.out.println(balance + bonus);
        } else {
            int bonus = 0;
            System.out.println(bonus);
            System.out.println(balance);
        }
    }
}