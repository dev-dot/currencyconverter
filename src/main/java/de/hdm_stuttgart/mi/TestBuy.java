package de.hdm_stuttgart.mi;

public class TestBuy {
    static double wallet = 200;
    static double newWallet;

    public static double buy(float currency) {

        newWallet = wallet * currency;

        return newWallet;
    }
}
