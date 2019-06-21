package de.hdm_stuttgart.mi;

import org.junit.Assert;
import org.junit.Test;

public class TestPrint {

    @Test
    public void testGetChoice(){
        //testing getChoice with different Strings, in case there should be a more specified selection
        Assert.assertArrayEquals(Currencies.dol, Print.getChoice("dol"));
        Assert.assertArrayEquals(Currencies.dol, Print.getChoice("Dollar"));
        Assert.assertArrayEquals(Currencies.pes, Print.getChoice("pes"));
        Assert.assertArrayEquals(Currencies.pes, Print.getChoice("Peso"));
        Assert.assertArrayEquals(Currencies.kro, Print.getChoice("kro"));
        Assert.assertArrayEquals(Currencies.kro, Print.getChoice("Krone"));
        Assert.assertArrayEquals(Currencies.empty, Print.getChoice("Euro"));
        Assert.assertArrayEquals(Currencies.empty, Print.getChoice("NOK"));

        Assert.assertArrayEquals(Currencies.empty, Print.getChoice(null));
    }
}
