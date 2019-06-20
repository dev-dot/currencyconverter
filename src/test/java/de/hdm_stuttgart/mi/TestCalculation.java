package de.hdm_stuttgart.mi;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class TestCalculation {

  @Test
    public void testGetCalculation() throws IOException{
      //gettin JsonObject from File to test method "getCalculation" located in class "Calculation"
      String filepath = new File("src\\main\\resources\\TestJson.json").getAbsolutePath();
      JsonParser jp = new JsonParser();
      JsonElement root = jp.parse(new FileReader(filepath));
      JsonObject jsonobj = root.getAsJsonObject();
      Gson gson = new Gson();
      AppRun.apiCurrencyObject = gson.fromJson(jsonobj, Currency.class);

      //testing with different currencies and values
      Assert.assertEquals(408.4585, Calculation.getCalculation("AUD",250.00), 0.001);
      Assert.assertEquals(280.0255, Calculation.getCalculation("USD",250.00), 0.001);
      Assert.assertEquals(1.2149, Calculation.getCalculation("JPY",0.01), 0.001);
      Assert.assertEquals(3381.6261, Calculation.getCalculation("NOK",345.54), 0.001);
      Assert.assertEquals(223.2855, Calculation.getCalculation("GBP",250.00), 0.001);
      Assert.assertEquals(341.2623, Calculation.getCalculation("CZK",13.34), 0.001);

  }
}
