package de.hdm_stuttgart.mi;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static Currency testObj;

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        Gson gson = new Gson();


        System.out.println("Bitte geben Sie ein Währung ein");
        String currency = input.next();

        System.out.println("In welche Währung wollen Sie konvertieren?");
        String tag = input.next();

        System.out.println("Wie viel wollen Sie konvertieren?");
        double amount = input.nextDouble();

        testObj = gson.fromJson(URLConnection.getJsonobj(currency), Currency.class);
        System.out.println(testObj.getBase());
        System.out.println(testObj.getTime_last_updated());

        System.out.println(Calculation.getCalculation(tag, amount));



    }
}