package de.hdm_stuttgart.mi;

public class Calculation {


    public static Double getCalculation(String tag, double amount){

        return amount * getCurrentRate(tag);
    }

    public static float getCurrentRate(String tag){
        switch (tag){
            case "AED":
                return App.testObj.getRates().getAED();

            case "ARS":
                return App.testObj.getRates().getARS();

            case "AUD":
                return App.testObj.getRates().getAUD();

            case "BGN":
                return App.testObj.getRates().getBGN();

            case "BRL":
                return App.testObj.getRates().getBRL();

            case "BSD":
                return App.testObj.getRates().getBSD();

            case "CAD":
                return App.testObj.getRates().getCAD();

            case "CHF":
                return App.testObj.getRates().getCHF();

            case "CLP":
                return App.testObj.getRates().getCLP();

            case "CNY":
                return App.testObj.getRates().getCNY();

            case "COP":
                return App.testObj.getRates().getCOP();

            case "CZK":
                return App.testObj.getRates().getCZK();

            case "DKK":
                return App.testObj.getRates().getDKK();

            case "DOP":
                return App.testObj.getRates().getDOP();

            case "EGP":
                return App.testObj.getRates().getEGP();

            case "EUR":
                return App.testObj.getRates().getEUR();

            case "FJD":
                return App.testObj.getRates().getFJD();

            case "GBP":
                return App.testObj.getRates().getGBP();

            case "GTQ":
                return App.testObj.getRates().getGTQ();

            case "HKD":
                return App.testObj.getRates().getHKD();

            case "HRK":
                return App.testObj.getRates().getHRK();

            case "HUF":
                return App.testObj.getRates().getHUF();

            case "IDR":
                return App.testObj.getRates().getIDR();

            case "ILS":
                return App.testObj.getRates().getILS();

            case "INR":
                return App.testObj.getRates().getINR();

            case "ISK":
                return App.testObj.getRates().getISK();

            case "JPY":
                return App.testObj.getRates().getJPY();

            case "KRW":
                return App.testObj.getRates().getKRW();

            case "KZT":
                return App.testObj.getRates().getKZT();

            case "MXN":
                return App.testObj.getRates().getMXN();

            case "MYR":
                return App.testObj.getRates().getMYR();

            case "NOK":
                return App.testObj.getRates().getNOK();

            case "NZD":
                return App.testObj.getRates().getNZD();

            case "PAB":
                return App.testObj.getRates().getPAB();

            case "PEN":
                return App.testObj.getRates().getPEN();

            case "PHP":
                return App.testObj.getRates().getPHP();

            case "PKR":
                return App.testObj.getRates().getPKR();

            case "PLN":
                return App.testObj.getRates().getPLN();

            case "PYG":
                return App.testObj.getRates().getPYG();

            case "RON":
                return App.testObj.getRates().getRON();

            case "RUB":
                return App.testObj.getRates().getRUB();

            case "SAR":
                return App.testObj.getRates().getSAR();

            case "SEK":
                return App.testObj.getRates().getSEK();

            case "SGD":
                return App.testObj.getRates().getSGD();

            case "THB":
                return App.testObj.getRates().getTHB();

            case "TRY":
                return App.testObj.getRates().getTRY();

            case "TWD":
                return App.testObj.getRates().getTWD();

            case "UAH":
                return App.testObj.getRates().getUAH();

            case "USD":
                return App.testObj.getRates().getUSD();

            case "UYU":
                return App.testObj.getRates().getUYU();

            case "VND":
                return App.testObj.getRates().getVND();

            case "ZAR":
                return App.testObj.getRates().getZAR();

            default:
                return 0.0F;


        }
    }
}
