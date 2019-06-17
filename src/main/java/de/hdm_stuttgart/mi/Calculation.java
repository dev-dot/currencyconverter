package de.hdm_stuttgart.mi;

public class Calculation {


    public static Double getCalculation(String tag, double amount){

        return amount * getCurrentRate(tag);
    }

    public static float getCurrentRate(String tag){
        switch (tag){
            case "AED":
                return AppRun.apiCurrencyObject.getRates().getAED();

            case "ARS":
                return AppRun.apiCurrencyObject.getRates().getARS();

            case "AUD":
                return AppRun.apiCurrencyObject.getRates().getAUD();

            case "BGN":
                return AppRun.apiCurrencyObject.getRates().getBGN();

            case "BRL":
                return AppRun.apiCurrencyObject.getRates().getBRL();

            case "BSD":
                return AppRun.apiCurrencyObject.getRates().getBSD();

            case "CAD":
                return AppRun.apiCurrencyObject.getRates().getCAD();

            case "CHF":
                return AppRun.apiCurrencyObject.getRates().getCHF();

            case "CLP":
                return AppRun.apiCurrencyObject.getRates().getCLP();

            case "CNY":
                return AppRun.apiCurrencyObject.getRates().getCNY();

            case "COP":
                return AppRun.apiCurrencyObject.getRates().getCOP();

            case "CZK":
                return AppRun.apiCurrencyObject.getRates().getCZK();

            case "DKK":
                return AppRun.apiCurrencyObject.getRates().getDKK();

            case "DOP":
                return AppRun.apiCurrencyObject.getRates().getDOP();

            case "EGP":
                return AppRun.apiCurrencyObject.getRates().getEGP();

            case "EUR":
                return AppRun.apiCurrencyObject.getRates().getEUR();

            case "FJD":
                return AppRun.apiCurrencyObject.getRates().getFJD();

            case "GBP":
                return AppRun.apiCurrencyObject.getRates().getGBP();

            case "GTQ":
                return AppRun.apiCurrencyObject.getRates().getGTQ();

            case "HKD":
                return AppRun.apiCurrencyObject.getRates().getHKD();

            case "HRK":
                return AppRun.apiCurrencyObject.getRates().getHRK();

            case "HUF":
                return AppRun.apiCurrencyObject.getRates().getHUF();

            case "IDR":
                return AppRun.apiCurrencyObject.getRates().getIDR();

            case "ILS":
                return AppRun.apiCurrencyObject.getRates().getILS();

            case "INR":
                return AppRun.apiCurrencyObject.getRates().getINR();

            case "ISK":
                return AppRun.apiCurrencyObject.getRates().getISK();

            case "JPY":
                return AppRun.apiCurrencyObject.getRates().getJPY();

            case "KRW":
                return AppRun.apiCurrencyObject.getRates().getKRW();

            case "KZT":
                return AppRun.apiCurrencyObject.getRates().getKZT();

            case "MXN":
                return AppRun.apiCurrencyObject.getRates().getMXN();

            case "MYR":
                return AppRun.apiCurrencyObject.getRates().getMYR();

            case "NOK":
                return AppRun.apiCurrencyObject.getRates().getNOK();

            case "NZD":
                return AppRun.apiCurrencyObject.getRates().getNZD();

            case "PAB":
                return AppRun.apiCurrencyObject.getRates().getPAB();

            case "PEN":
                return AppRun.apiCurrencyObject.getRates().getPEN();

            case "PHP":
                return AppRun.apiCurrencyObject.getRates().getPHP();

            case "PKR":
                return AppRun.apiCurrencyObject.getRates().getPKR();

            case "PLN":
                return AppRun.apiCurrencyObject.getRates().getPLN();

            case "PYG":
                return AppRun.apiCurrencyObject.getRates().getPYG();

            case "RON":
                return AppRun.apiCurrencyObject.getRates().getRON();

            case "RUB":
                return AppRun.apiCurrencyObject.getRates().getRUB();

            case "SAR":
                return AppRun.apiCurrencyObject.getRates().getSAR();

            case "SEK":
                return AppRun.apiCurrencyObject.getRates().getSEK();

            case "SGD":
                return AppRun.apiCurrencyObject.getRates().getSGD();

            case "THB":
                return AppRun.apiCurrencyObject.getRates().getTHB();

            case "TRY":
                return AppRun.apiCurrencyObject.getRates().getTRY();

            case "TWD":
                return AppRun.apiCurrencyObject.getRates().getTWD();

            case "UAH":
                return AppRun.apiCurrencyObject.getRates().getUAH();

            case "USD":
                return AppRun.apiCurrencyObject.getRates().getUSD();

            case "UYU":
                return AppRun.apiCurrencyObject.getRates().getUYU();

            case "VND":
                return AppRun.apiCurrencyObject.getRates().getVND();

            case "ZAR":
                return AppRun.apiCurrencyObject.getRates().getZAR();

            default:
                return 0.0F;


        }
    }
}
