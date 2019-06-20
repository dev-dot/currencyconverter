package de.hdm_stuttgart.mi;


public class Currency {

    private String base;
    private String date;
    private long time_last_updated;

    private Rates rates;


// Getter Methods

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public long getTime_last_updated() {
        return time_last_updated;
    }

    public Rates getRates() {
        return rates;
    }


    // Setter Methods

    public void setBase(String base) {
        this.base = base;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime_last_updated(long time_last_updated) {
        this.time_last_updated = time_last_updated;
    }

    public void setRates(Rates rates) {this.rates = rates; }
}
