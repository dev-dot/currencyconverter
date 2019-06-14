package de.hdm_stuttgart.mi;

import java.text.*;
import java.util.Scanner;


public class print {

    //  f. in front of a double variable will only show 2 decimal place

    public static DecimalFormat f = new DecimalFormat("#0.00");

    public static void Startmenu(String fromcurrency, String tocurrency){
        upperMenuCurrencies(fromcurrency,tocurrency);
        lowerMenuCommands();
    }

    public static void CalculatorMenu(String fromcurrency, String tocurrency, double amounttobuy, double amounttosell){
        upperMenuCalculator(fromcurrency,tocurrency,amounttobuy,amounttosell);
        lowerMenuCommands();
    }

    public static void upperMenuCurrencies(String fromcurrency, String tocurrency){
        System.out.println( "Currency to buy: " + fromcurrency);
        System.out.println( "Currency to sell: " + tocurrency);
        System.out.println( "+++++++++++++++++++++++++++++++++++");
    }

    public static void upperMenuCalculator(String fromcurrency, String tocurrency, double amounttobuy, double amounttosell){
        System.out.println( "Buying " + f.format(amounttobuy) + " of " + fromcurrency);
        System.out.println( "Selling " + f.format(amounttosell) + " of " + tocurrency);
        System.out.println( "+++++++++++++++++++++++++++++++++++");
    }

    public static void lowerMenuCommands(){
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

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

//      getChoice looks for an equal String in a given array of Strings to the given String
//      and returns if equal a preselected Currencies-array

    public static Currencies[] getChoice (String str) {
        Scanner input = new Scanner(System.in);
        String[] currName = {"Dollar", "dol", "Peso", "pes", "Krone", "kro"};
        int countId = -1;
        Currencies[] selection = {};
        Currencies result;
        for (int i = 0; i < currName.length; i++) {
            if (currName[i].equalsIgnoreCase(str)) {
                countId = i;
                break;
            }
        }
        switch (countId) {
            case 0:
            case 1:
                return AllCurrencies.dol;
            case 2:
            case 3:
                return AllCurrencies.pes;
            case 4:
            case 5:
                return AllCurrencies.kro;
            default:
                return AllCurrencies.empty;
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
            return array[entry];
        }else {
            return AllCurrencies.emptyCurrency;
        }
    }
}

