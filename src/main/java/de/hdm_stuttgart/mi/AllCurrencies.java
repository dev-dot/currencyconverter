package de.hdm_stuttgart.mi;

class Currencies {
        String fullname;
        String tag;

        public Currencies(String Fullname, String Tag){
                this.fullname = Fullname;
                this.tag = Tag;
        }

        public String getFullname() {
            return fullname;
        }

        public String getTag() {
            return tag;
        }
    }

public class AllCurrencies {
        static Currencies EUR = new Currencies("Euro", "EUR");
        static Currencies AED = new Currencies("Emirati dirham","VAE");
        static Currencies ARS = new Currencies("Argentine peso","ARS");
        static Currencies AUD = new Currencies("Australian dollar","AUD");
        static Currencies BGN = new Currencies("Bulgarian Lew","BGN");
        static Currencies BRL = new Currencies("Brasilian Real","BRL");
        static Currencies BSD = new Currencies("Bahamian dollar","BSD");
        static Currencies CAD = new Currencies("Canadian Dollar","CAD");
        static Currencies CHF = new Currencies("Swiss frank","CHF");
        static Currencies CLP = new Currencies("Chilean peso","CLP");
        static Currencies CNY = new Currencies("Chinese Yuan","CNY");
        static Currencies COP = new Currencies("Columbian Peso","COP");
        static Currencies CZK = new Currencies("Czech koruna","CZK");
        static Currencies DKK = new Currencies("Danish krone","DKK");
        static Currencies DOP = new Currencies("Dominican Peso","DOP");
        static Currencies EGP = new Currencies("Egyptian pound","EGP");
        static Currencies FJD = new Currencies("Fijian dollar ","FJD");
        static Currencies GBP = new Currencies("British pound","GBP");
        static Currencies GTQ = new Currencies("Quetzal","GTQ");
        static Currencies HKD = new Currencies("Hong Kong Dollar","HKD");
        static Currencies HRK = new Currencies("Kuna","HRK");
        static Currencies HUF = new Currencies("Hungarian forint","HUF");
        static Currencies IDR = new Currencies("Indonesian rupiah","IDR");
        static Currencies ILS = new Currencies("Shekel","ILS");
        static Currencies INR = new Currencies("Indian rupee","INR");
        static Currencies ISK = new Currencies("Icelandic krona","ISK");
        static Currencies JPY = new Currencies("Japanese yen","JPY");
        static Currencies KRW = new Currencies("South Korean won","KRW");
        static Currencies KZT = new Currencies("Kazakhstani tenge","KZT");
        static Currencies MXN = new Currencies("Mexican peso","MXN");
        static Currencies MYR = new Currencies("Malaysian ringgit","MYR");
        static Currencies NOK = new Currencies("Norwegian krone","NOK");
        static Currencies NZD = new Currencies("New Zealand dollar","NZD");
        static Currencies PAB = new Currencies("Balboa","PAB");
        static Currencies PEN = new Currencies("Sol","PEN");
        static Currencies PHP = new Currencies("Philippine peso","PHP");
        static Currencies PKR = new Currencies("Pakistani rupee","PKR");
        static Currencies PLN = new Currencies("Zloty","PLN");
        static Currencies PYG = new Currencies("Guarani","PYG");
        static Currencies RON = new Currencies("Romanian leu","RON");
        static Currencies RUB = new Currencies("Russian rubel","RUB");
        static Currencies SAR = new Currencies("Saudi riyal","SAR");
        static Currencies SEK = new Currencies("Swedish krona","SEK");
        static Currencies SGD = new Currencies("Singapore dollar","SGD");
        static Currencies THB = new Currencies("Baht","THB");
        static Currencies TRY = new Currencies("Turkish lira","TRY");
        static Currencies TWD = new Currencies("Taiwanese dollar","TWD");
        static Currencies UAH = new Currencies("Hrywna","UAH");
        static Currencies USD = new Currencies("U.S. Dollar","USD");
        static Currencies UYU = new Currencies("Uruguayan peso","UYU");
        static Currencies VND = new Currencies("Dong","VND");
        static Currencies ZAR = new Currencies("South African rand","ZAR");
        static Currencies emptyCurrency = new Currencies("","");

      static Currencies[] all ={EUR,AED,ARS,AUD,BGN,BRL,BSD,CAD,CHF,CLP,CNY,COP,CZK,DKK,DOP,EGP,FJD,GBP,GTQ,HKD,HRK,HUF,IDR,ILS,INR,ISK,
                                JPY,KRW,KZT,MXN,MYR,NOK,NZD,PAB,PEN,PHP,PKR,PLN,PYG,RON,RUB,SAR,SEK,SGD,THB,TRY,TWD,UAH,USD,UYU,VND,ZAR};
      static Currencies[] dol = {AUD,BSD,CAD,FJD,HKD,NZD,SGD,TWD,USD};
      static Currencies[] pes = {ARS,CLP,COP,DOP,MXN,PHP,UYU};
      static Currencies[] kro = {CZK,DKK,ISK,NOK,SEK};
      static Currencies[] empty = {};



//      getPosition gets a String and runs through an array of all currencies to find a matching name or tag,
//      and returns that position number

      public static int getPosition (String str) {
                int counter = 0;
                for (int i = 0; i < AllCurrencies.all.length;i++){
                        if (AllCurrencies.all[i].tag.equalsIgnoreCase(str) || AllCurrencies.all[i].fullname.equalsIgnoreCase(str)) {
                                counter = i;
                                break;
                        }
                }
                return counter;
      }
}
