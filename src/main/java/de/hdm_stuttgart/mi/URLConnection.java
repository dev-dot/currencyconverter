package de.hdm_stuttgart.mi;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConnection {



    public static JsonObject jsonobj;

    public static JsonObject getJsonobj(String httpCurrency) throws IOException {

        // Setting URL
        String url_str = "https://api.exchangerate-api.com/v4/latest/" + httpCurrency;

// Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

// Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        jsonobj = root.getAsJsonObject();
//Disconnecting
        request.disconnect();

        return jsonobj;

    }
}
