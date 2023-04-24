package ru.netology;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = service.calculate(5000, true);
        System.out.println(amount);

    }
}