package de.hdm_stuttgart.mi;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Scanner;
import java.text.*;

public class AppRun {

//  needed variables

    public static Currency apiCurrencyObject;
    private static String buyTag = "";
    private static String sellTag = "";
    private static Currencies selectedCurrency;
    private static boolean exit = false;
    private static boolean bothcurrencies = false;
    private static String entry;
    private static String fromcurrency = "not set";
    private static String tocurrency = "not set";
    private static double amounttosell = 0;
    private static double amounttobuy = 0;



    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

//--------------------------------------- start of loop --------------------------------------------------------
        while (!exit) {
            Print.clearConsole();
            if (!bothcurrencies) {                                  // if not both currencies are set, a different menu will be displayed
                Print.Startmenu(fromcurrency, tocurrency);
                entry = input.next();
                input.reset();
                switch (entry) {                                    // a switch statement helps with easier navigation through the menu
                    case "0":
                        Print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if (entry.equalsIgnoreCase("xxx")) {
                        } else {
                        setBuyingCurrency(entry);}

                        if ((!fromcurrency.equals("not set") && !tocurrency.equals("not set"))) {
                            bothcurrencies = true;
                        }
                        break;
                    case "1":
                        Print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if (entry.equalsIgnoreCase("xxx")) {
                        } else {
                        setSellingCurrency(entry);}

                        if ((!fromcurrency.equals("not set") && !tocurrency.equals("not set"))) {
                            bothcurrencies = true;
                        }

                        break;
                    case "2":
                        Print.commandAmount();
                        try {
                            amounttobuy = input.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Wrong input");
                        }
                        input.reset();
                        break;
                    case "x":
                        exit = true;
                        break;
                    case "X":
                        exit = true;
                        break;
                    default:
                        System.out.println("Wrong input");
                }
            } else                                                     // both currencies have been set
            {   amountToBuyNotNull();
                Print.CalculatorMenu(fromcurrency, tocurrency, amounttobuy, amounttosell);
                entry = input.next();
                input.reset();

                switch (entry) {
                    case "0":
                        Print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if (entry.equalsIgnoreCase("xxx")) {
                        } else {
                        setBuyingCurrency(entry);}
                    break;
                    case "1":
                        Print.commandCurrency();
                        entry = input.next();
                        input.reset();
                        if (entry.equalsIgnoreCase("xxx")) {
                        } else {
                        setSellingCurrency(entry);}
                    break;
                    case "2":
                        Gson gson = new Gson();
                        apiCurrencyObject = gson.fromJson(URLConnection.getJsonobj(buyTag), Currency.class);
                        Print.commandAmount();
                        try {
                            amounttobuy = input.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Wrong input");
                        }
                        amounttosell = Calculation.getCalculation(sellTag,  amounttobuy);
                    break;
                    case "x":
                        exit = true;
                    break;
                    default:
                        System.out.println("Wrong input");
                }
            }
        }
    }
//--------------------------------------- end of loop --------------------------------------------------------

//      Here are two Currency-Setters
//      if a given String equals with a specified short term for a currency, like "dol", "pes"...
//      the method will start a selection method and set both currency name and tag after that.
//      otherwise, it will loop through an array of all currencies to find one that whose tag or
//      full name equal the given String.

        public static void setBuyingCurrency(String entry){
            if (Print.getChoice(entry).length > 0) {
                selectedCurrency = Print.selection(Print.getChoice(entry), fromcurrency, tocurrency);
                fromcurrency = selectedCurrency.getFullname();
                buyTag = selectedCurrency.getTag();
            } else {
                int index = Currencies.getPosition(entry);
                fromcurrency = Currencies.all[index].getFullname();
                buyTag = Currencies.all[index].getTag();
            }
        }

        public static void setSellingCurrency(String entry){
            if (Print.getChoice(entry).length > 0) {
                selectedCurrency = Print.selection(Print.getChoice(entry), fromcurrency, tocurrency);
                tocurrency = selectedCurrency.getFullname();
                sellTag = selectedCurrency.getTag();
            }else {
                int index2 = Currencies.getPosition(entry);
                tocurrency = Currencies.all[index2].getFullname();
                sellTag = Currencies.all[index2].getTag();
            }
        }


//      a method to check if the amount was set before both currencies were set, and in that case
//      already calculate the result

        public static void amountToBuyNotNull() throws IOException {
            if(amounttobuy != 0) {
                Gson gson = new Gson();
                apiCurrencyObject = gson.fromJson(URLConnection.getJsonobj(buyTag), Currency.class);
                amounttosell = Calculation.getCalculation(sellTag,  amounttobuy);
            } else {}
        }
}


