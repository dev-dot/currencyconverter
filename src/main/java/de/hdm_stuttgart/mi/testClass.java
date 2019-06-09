/*
package de.hdm_stuttgart.mi;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testClass {


    public static void main(String[] args) throws IOException {

        URLConnection.httpCurrency = "EUR";
        Gson gson = new Gson();
        URLConnection.url();


        try {

            System.out.println("Reading JSON from a URL");
            System.out.println("----------------------------");

            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/antonrichter/Nextcloud/IDEA Project/CurrencyConverter/src/main/java/de/hdm_stuttgart/mi/testFile.json"));

            //convert the json string back to object
            //  Currency currencyObj = gson.fromJson(br, Currency.class);

            Currency euroObj = gson.fromJson(URLConnection.jsonobj, Currency.class);

            System.out.println("Base: " + euroObj.getBase());

            System.out.println("Date: " + euroObj.getDate());

            System.out.println("Time_Last: " + euroObj.getTime_last_updated());

            System.out.println("AED  :" + euroObj.getRates().getAED());
            System.out.println("Wallet: " + TestBuy.wallet);
            System.out.println("Change Wallet in AED: " + TestBuy.buy(euroObj.getRates().getUSD()));
            System.out.println("New Wallet: " + TestBuy.newWallet);


            Converter eurUsd = new Converter(euroObj.getRates().getEUR(), 200);
            System.out.println(eurUsd.convertBuyToSell(euroObj.getRates().getUSD()));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

*/
