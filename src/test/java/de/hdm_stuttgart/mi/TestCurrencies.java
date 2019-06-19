package de.hdm_stuttgart.mi;

import org.junit.Assert;
import org.junit.Test;

public class TestCurrencies {
    @Test
    public void testGetPosition(){
        //testing Tags
        Assert.assertEquals(1, Currencies.getPosition("EUR"));
        Assert.assertEquals(4, Currencies.getPosition("AUD"));
        Assert.assertEquals(7, Currencies.getPosition("BSD"));
        Assert.assertEquals(14, Currencies.getPosition("DKK"));
        Assert.assertEquals(23, Currencies.getPosition("IDR"));
        Assert.assertEquals(27, Currencies.getPosition("JPY"));
        Assert.assertEquals(35, Currencies.getPosition("PEN"));
        Assert.assertEquals(50, Currencies.getPosition("UYU"));

        //testing full names (ignoring case)
        Assert.assertEquals(1, Currencies.getPosition("Euro"));
        Assert.assertEquals(3, Currencies.getPosition("Argentine Peso"));
        Assert.assertEquals(3, Currencies.getPosition("ArGEntine Peso"));
        Assert.assertEquals(13, Currencies.getPosition("Czech Koruna"));
        Assert.assertEquals(13, Currencies.getPosition("Czech KoruNA"));
        Assert.assertEquals(17, Currencies.getPosition("FIJIAN Dollar"));

        //testing for null
        Assert.assertEquals(0, Currencies.getPosition(null));
    }
}
