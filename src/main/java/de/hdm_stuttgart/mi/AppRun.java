package de.hdm_stuttgart.mi;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Scanner;
import java.text.*;

public class AppRun {
    public static Currency testObj;
    public static String buyTag = "";
    public static String sellTag = "";

//  Mit f. vor einer Double Variable wird sie hiermit nur mit 2 Nachkommastellen angezeigt
    public static DecimalFormat f = new DecimalFormat("#0.00");

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);


//  benötigte Variablen
        boolean exit = false;
        boolean bothcurrencies = false;
        String entry;
        String fromcurrency = "not set";
        String tocurrency = "not set";
        double amounttosell = 0;
        double amounttobuy = 0;
        Currencies selectedCurrency;

//  Schleife
        while (!exit) {
            print.clearConsole();
            if (!bothcurrencies) {
                print.Startmenu(fromcurrency,tocurrency);
                entry = input.next();
                input.reset();
                switch (entry) {
                    case "0":       // Gewünschte Währung auswählen
                        print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if(print.getChoice(entry).length > 0){
                            selectedCurrency = print.selection(print.getChoice(entry));
                            fromcurrency = selectedCurrency.getFullname();
                            buyTag = selectedCurrency.getTag();
                        } else {
                            int index = AllCurrencies.getPosition(entry);
                            fromcurrency = AllCurrencies.all[index].getFullname();
                            buyTag = AllCurrencies.all[index].getTag();
                        }

                        if ((!fromcurrency.equals("not set") && !tocurrency.equals("not set"))) {
                            bothcurrencies = true;
                        }
                        break;
                    case "1":
// Gewünschte 2. Währung auswählen
                        print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if(print.getChoice(entry).length > 0){
                            selectedCurrency = print.selection(print.getChoice(entry));
                            tocurrency = selectedCurrency.getFullname();
                            sellTag = selectedCurrency.getTag();
                        }else {
                            int index2 = AllCurrencies.getPosition(entry);
                            tocurrency = AllCurrencies.all[index2].getFullname();
                            sellTag = AllCurrencies.all[index2].getTag();
                        }
                        if ((!fromcurrency.equals("not set") && !tocurrency.equals("not set"))) {
                            bothcurrencies = true;
                        }

                        break;
                    case "2":
                        print.commandAmount();
                        amounttobuy = input.nextDouble();
                        input.reset();
                        break;
                    case "x":
                        exit = true;
                        break;
                    default:
                        System.out.println("Eingabefehler");
                }
            } else

// Beide Währungen wurden gesettet
            {
                print.CalculatorMenu(fromcurrency,tocurrency,amounttobuy,amounttosell);
                entry = input.next();
                input.reset();
                switch (entry) {
                    case "0":
                        print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if(print.getChoice(entry).length > 0){
                            selectedCurrency = print.selection(print.getChoice(entry));
                            fromcurrency = selectedCurrency.getFullname();
                            buyTag = selectedCurrency.getTag();
                        } else {
                            int index = AllCurrencies.getPosition(entry);
                            fromcurrency = AllCurrencies.all[index].getFullname();
                            buyTag = AllCurrencies.all[index].getTag();
                        }
                    break;
                    case "1":
                        print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if(print.getChoice(entry).length > 0){
                            selectedCurrency = print.selection(print.getChoice(entry));
                            tocurrency = selectedCurrency.getFullname();
                            sellTag = selectedCurrency.getTag();
                        }else {
                            int index2 = AllCurrencies.getPosition(entry);
                            tocurrency = AllCurrencies.all[index2].getFullname();
                            sellTag = AllCurrencies.all[index2].getTag();
                        }
                    break;
                    case "2":
                        Gson gson = new Gson();
                        testObj = gson.fromJson(URLConnection.getJsonobj(buyTag), Currency.class);
                        print.commandAmount();
                        amounttobuy = input.nextDouble();
                        amounttosell = Calculation.getCalculation(sellTag,  amounttobuy);
                    break;
                    case "x":
                        exit = true;
                    break;
                    default:
                        System.out.println("Eingabefehler");
                }
            }
        }
    }
//---------------------------------------Ende der Main-Methode--------------------------------------------------------









/*
    public static void main(String[] args) {
        // Test
        Scanner input = new Scanner(System.in);
        System.out.println("Gib etwas ein: ");
        String entry = input.next();
        input.reset();
        Currencies result;
        result = print.getChoice(entry);
        System.out.println(result.fullname +" " + result.tag);
    }
*/
}


