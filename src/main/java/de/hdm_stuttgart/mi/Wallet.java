package de.hdm_stuttgart.mi;

public class Wallet {
    private static double wallet;

    public static double getWallet() {
        return wallet;
    }

    public static void setWallet(double wallet) {
        Wallet.wallet = wallet;
    }
}
