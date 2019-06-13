package de.hdm_stuttgart.mi;

import javax.crypto.AEADBadTagException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Currencies {
        String fullname;
        String tag;
        String category;
        float rate;

        public Currencies(String Fullname, String Tag,String category) {
                this.fullname = Fullname;
                this.tag = Tag;
                this.category=category;
        }

        public Currencies(String Fullname, String Tag){
                this.fullname = Fullname;
                this.tag = Tag;
        }

        public Currencies(String Fullname, String Tag,String Category,float Rate) {
                this.fullname = Fullname;
                this.tag = Tag;
                this.category=Category;
                this.rate=Rate;
        }

        public Currencies(String Fullname, String Tag,float Rate){
                this.fullname = Fullname;
                this.tag = Tag;
                this.rate=Rate;
        }

        public void setRate(float rate) {
                this.rate = rate;
        }

        public String getFullname() {
            return fullname;
        }

        public String getTag() {
            return tag;
        }

        public String getCategory() {return category;}
    }

public class AllCurrencies {
        static Currencies EUR = new Currencies("Euro", "EUR");
        static Currencies AED = new Currencies("VAE Dirham","VAE");
        static Currencies ARS = new Currencies("Argentinischer Peso","ARS","PES");
        static Currencies AUD = new Currencies("Australischer Dollar","AUD", "DOL");
        static Currencies BGN = new Currencies("Bulgarische Lew","BGN");
        static Currencies BRL = new Currencies("Brasilianischer Real","BRL");
        static Currencies BSD = new Currencies("Bahama-Dollar","BSD", "DOL");
        static Currencies CAD = new Currencies("Kanadischer Dollar","CAD", "DOL");
        static Currencies CHF = new Currencies("Schweizer Franken","CHF");
        static Currencies CLP = new Currencies("Chilenischer Peso","CLP","PES");
        static Currencies CNY = new Currencies("Chinesischer Renminbi Yuan","CNY");
        static Currencies COP = new Currencies("Kolumbianischer Peso","COP","PES");
        static Currencies CZK = new Currencies("Tschechische Krone","CZK","KRO");
        static Currencies DKK = new Currencies("Dänische Krone","DKK","KRO");
        static Currencies DOP = new Currencies("Dominikanischer Peso","DOP","PES");
        static Currencies EGP = new Currencies("Ägyptisches Pfund","EGP");
        static Currencies FJD = new Currencies("Fidschi-Dollar","FJD", "DOL");
        static Currencies GBP = new Currencies("Britische Pfund","GBP");
        static Currencies GTQ = new Currencies("Quetzal","GTQ");
        static Currencies HKD = new Currencies("Hong Kong-Dollar","HKD","DOL");
        static Currencies HRK = new Currencies("Kuna","HRK");
        static Currencies HUF = new Currencies("Ungarischer Forint","HUF");
        static Currencies IDR = new Currencies("Indonesische Rupie","IDR");
        static Currencies ILS = new Currencies("Neuer Schekel","ILS");
        static Currencies INR = new Currencies("Indische Rupie","INR");
        static Currencies ISK = new Currencies("Isländische Krone","ISK");
        static Currencies JPY = new Currencies("Japanischer Yen","JPY");
        static Currencies KRW = new Currencies("Südkoreanischer Won","KRW");
        static Currencies KZT = new Currencies("Kasachischer Tenge","KZT");
        static Currencies MXN = new Currencies("Mexikanischer Peso","MXN","PES");
        static Currencies MYR = new Currencies("Malaysicher Ringgit","MYR");
        static Currencies NOK = new Currencies("Norwegische Krone","NOK","KRO");
        static Currencies NZD = new Currencies("Neuseeländischer Dollar","NZD","DOL");
        static Currencies PAB = new Currencies("Balboa","PAB");
        static Currencies PEN = new Currencies("Sol","PEN");
        static Currencies PHP = new Currencies("Philippinischer Peso","PHP","PES");
        static Currencies PKR = new Currencies("Pakistanische Rupie","PKR");
        static Currencies PLN = new Currencies("Polnischer Zloty","PLN");
        static Currencies PYG = new Currencies("Guarani","PYG");
        static Currencies RON = new Currencies("Rumänische Leu","RON");
        static Currencies RUB = new Currencies("Russischer Rubel","RUB");
        static Currencies SAR = new Currencies("Saudi Riyal","SAR");
        static Currencies SEK = new Currencies("Schwedische Krone","SEK","KRO");
        static Currencies SGD = new Currencies("Singapur Dollar","SGD","DOL");
        static Currencies THB = new Currencies("Thai Baht","THB");
        static Currencies TRY = new Currencies("Türkische Lira","TRY");
        static Currencies TWD = new Currencies("Taiwanesischer Dollar","TWD","DOL");
        static Currencies UAH = new Currencies("Hrywna","UAH");
        static Currencies USD = new Currencies("U.S. Dollar","USD","DOL");
        static Currencies UYU = new Currencies("Uruguayischer Peso","UYU","PES");
        static Currencies VND = new Currencies("Dong","VND");
        static Currencies ZAR = new Currencies("Südafrikanischer Rand","ZAR");
        static Currencies emptyCurrency = new Currencies("","");

      static Currencies[] all ={EUR,AED,ARS,AUD,BGN,BRL,BSD,CAD,CHF,CLP,CNY,COP,CZK,DKK,DOP,EGP,FJD,GBP,GTQ,HKD,HRK,HUF,IDR,ILS,INR,ISK,
                                JPY,KRW,KZT,MXN,MYR,NOK,NZD,PAB,PEN,PHP,PKR,PLN,PYG,RON,RUB,SAR,SEK,SGD,THB,TRY,TWD,UAH,USD,UYU,VND,ZAR};
      static Currencies[] dol = {AUD,BSD,CAD,FJD,HKD,NZD,SGD,TWD,USD};
      static Currencies[] pes = {ARS,CLP,COP,DOP,MXN,PHP,UYU};
      static Currencies[] kro = {CZK,DKK,ISK,NOK,SEK};
      static Currencies[] empty = {};


//      getPosition sucht mithilfe eines Strings die Stelle einer übereinstimmenden Währung im all-array heraus,
//      sodass mit dem Inhalt dieser Währung weitergearbeitet werden kann

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
