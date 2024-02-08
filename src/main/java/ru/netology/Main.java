package ru.netology;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialAccount = 100;
        int pay = 900;
        int bonus = pay / 100;

        if (pay >= 1000) {
            System.out.println(initialAccount + pay + bonus);
        } else {
            System.out.println(initialAccount + pay);
        }

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}