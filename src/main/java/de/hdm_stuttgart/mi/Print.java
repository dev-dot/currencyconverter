package de.hdm_stuttgart.mi;

import java.text.*;
import java.util.Scanner;


public class Print {

    //  f. in front of a double variable will only show 2 decimal place

    private static DecimalFormat f = new DecimalFormat("#0.00");

    public static void Startmenu(String fromcurrency, String tocurrency){
        upperMenuCurrencies(fromcurrency,tocurrency);
        lowerMenuCommands();
    }

    public static void CalculatorMenu(String fromcurrency, String tocurrency, double amounttobuy, double amounttosell){
        upperMenuCalculator(fromcurrency,tocurrency,amounttobuy,amounttosell);
        lowerMenuCommands();
    }

    private static void upperMenuCurrencies(String fromcurrency, String tocurrency) {
        System.out.println( "Currency to buy: " + fromcurrency);
        System.out.println( "Currency to sell: " + tocurrency);
        System.out.println( "+++++++++++++++++++++++++++++++++++");
    }

    private static void upperMenuCalculator(String fromcurrency, String tocurrency, double amounttobuy, double amounttosell) {
        System.out.println( "Buying " + f.format(amounttobuy) + " of " + fromcurrency);
        System.out.println( "Selling " + f.format(amounttosell) + " of " + tocurrency);
        System.out.println( "+++++++++++++++++++++++++++++++++++");
    }

    private static void lowerMenuCommands() {
        System.out.println( "0: Select currency to buy\n" +
                            "1: Select currency to sell\n" +
                            "2: Choose amount to be converted:");
        System.out.println( "Please choose an option (>x< to exit): ");
    }

    public static void commandAmount() {
        System.out.println("Enter an amount: ");

    }

    public static void commandCurrency(){
        System.out.println("Enter a currency's name or part of it(>xxx< to exit): ");
    }

    public static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

//      getChoice looks for an equal String in a given array of Strings to the given String
//      and returns if equal a preselected Currencies-array

    public static Currencies[] getChoice (String str) {
        String[] currName = {"Dollar", "dol", "Peso", "pes", "Krone", "kro"};
        int countId = -1;
        for (int i = 0; i < currName.length; i++) {
            if (currName[i].equalsIgnoreCase(str)) {
                countId = i;
                break;
            }
        }
        switch (countId) {
            case 0:
            case 1:
                return Currencies.dol;
            case 2:
            case 3:
                return Currencies.pes;
            case 4:
            case 5:
                return Currencies.kro;
            default:
                return Currencies.empty;
        }
    }

//      selection creates a new window and shows all the Currencies in an array with their index number
//      After the user entered the wanted index number, the method returns that Currency-object for further
//      implementation

    public static Currencies selection (Currencies[] array,String fromcurrency, String tocurrency){
        Scanner input = new Scanner(System.in);
        clearConsole();
        upperMenuCurrencies(fromcurrency,tocurrency);
        if (array.length > 0){
            for (int i = 0;i<array.length;i++){
                System.out.println(i + ": " + array[i].fullname);
            }
            System.out.println("Select a currency by index: ");
            int entry = input.nextInt();
            input.reset();
            if (entry >= array.length || entry < 0){
                return Currencies.emptyCurrency;
            }else {
                return array[entry];
            }
        }else {
            return Currencies.emptyCurrency;
        }
    }
}

