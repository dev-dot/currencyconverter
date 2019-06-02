package de.hdm_stuttgart.mi;

public class Currency {

    private String base;
    private String date;
    private float time_last_updated;
    private Rates RatesObject;


    // Getter Methods

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public float getTime_last_updated() {
        return time_last_updated;
    }

    public Rates getRates() {
        return RatesObject;
    }

    // Setter Methods

    public void setBase(String base) {
        this.base = base;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime_last_updated(float time_last_updated) {
        this.time_last_updated = time_last_updated;
    }

    public void setRates(Rates ratesObject) {
        this.RatesObject = ratesObject;
    }


}
