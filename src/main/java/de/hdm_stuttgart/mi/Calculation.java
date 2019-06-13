package de.hdm_stuttgart.mi;

public class Calculation {


    public static Double getCalculation(String tag, double amount){

        return amount * getCurrentRate(tag);
    }

    public static float getCurrentRate(String tag){
        switch (tag){
            case "AED":
                return AppRun.testObj.getRates().getAED();

            case "ARS":
                return AppRun.testObj.getRates().getARS();

            case "AUD":
                return AppRun.testObj.getRates().getAUD();

            case "BGN":
                return AppRun.testObj.getRates().getBGN();

            case "BRL":
                return AppRun.testObj.getRates().getBRL();

            case "BSD":
                return AppRun.testObj.getRates().getBSD();

            case "CAD":
                return AppRun.testObj.getRates().getCAD();

            case "CHF":
                return AppRun.testObj.getRates().getCHF();

            case "CLP":
                return AppRun.testObj.getRates().getCLP();

            case "CNY":
                return AppRun.testObj.getRates().getCNY();

            case "COP":
                return AppRun.testObj.getRates().getCOP();

            case "CZK":
                return AppRun.testObj.getRates().getCZK();

            case "DKK":
                return AppRun.testObj.getRates().getDKK();

            case "DOP":
                return AppRun.testObj.getRates().getDOP();

            case "EGP":
                return AppRun.testObj.getRates().getEGP();

            case "EUR":
                return AppRun.testObj.getRates().getEUR();

            case "FJD":
                return AppRun.testObj.getRates().getFJD();

            case "GBP":
                return AppRun.testObj.getRates().getGBP();

            case "GTQ":
                return AppRun.testObj.getRates().getGTQ();

            case "HKD":
                return AppRun.testObj.getRates().getHKD();

            case "HRK":
                return AppRun.testObj.getRates().getHRK();

            case "HUF":
                return AppRun.testObj.getRates().getHUF();

            case "IDR":
                return AppRun.testObj.getRates().getIDR();

            case "ILS":
                return AppRun.testObj.getRates().getILS();

            case "INR":
                return AppRun.testObj.getRates().getINR();

            case "ISK":
                return AppRun.testObj.getRates().getISK();

            case "JPY":
                return AppRun.testObj.getRates().getJPY();

            case "KRW":
                return AppRun.testObj.getRates().getKRW();

            case "KZT":
                return AppRun.testObj.getRates().getKZT();

            case "MXN":
                return AppRun.testObj.getRates().getMXN();

            case "MYR":
                return AppRun.testObj.getRates().getMYR();

            case "NOK":
                return AppRun.testObj.getRates().getNOK();

            case "NZD":
                return AppRun.testObj.getRates().getNZD();

            case "PAB":
                return AppRun.testObj.getRates().getPAB();

            case "PEN":
                return AppRun.testObj.getRates().getPEN();

            case "PHP":
                return AppRun.testObj.getRates().getPHP();

            case "PKR":
                return AppRun.testObj.getRates().getPKR();

            case "PLN":
                return AppRun.testObj.getRates().getPLN();

            case "PYG":
                return AppRun.testObj.getRates().getPYG();

            case "RON":
                return AppRun.testObj.getRates().getRON();

            case "RUB":
                return AppRun.testObj.getRates().getRUB();

            case "SAR":
                return AppRun.testObj.getRates().getSAR();

            case "SEK":
                return AppRun.testObj.getRates().getSEK();

            case "SGD":
                return AppRun.testObj.getRates().getSGD();

            case "THB":
                return AppRun.testObj.getRates().getTHB();

            case "TRY":
                return AppRun.testObj.getRates().getTRY();

            case "TWD":
                return AppRun.testObj.getRates().getTWD();

            case "UAH":
                return AppRun.testObj.getRates().getUAH();

            case "USD":
                return AppRun.testObj.getRates().getUSD();

            case "UYU":
                return AppRun.testObj.getRates().getUYU();

            case "VND":
                return AppRun.testObj.getRates().getVND();

            case "ZAR":
                return AppRun.testObj.getRates().getZAR();

            default:
                return 0.0F;


        }
    }
}
