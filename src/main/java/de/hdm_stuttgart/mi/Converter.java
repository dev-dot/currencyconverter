package de.hdm_stuttgart.mi;

public class Converter {

    public static double buyCurrency;
    public static double sellCurrency;
    public static double amount;

    public Converter(double buyingCurrency, double amount) {
        this.buyCurrency = buyingCurrency;
        this.amount = amount;
    }

    public static double convertBuyToSell(double sellCurrency) {

        sellCurrency = sellCurrency * buyCurrency * amount;
        return sellCurrency;
    }


}