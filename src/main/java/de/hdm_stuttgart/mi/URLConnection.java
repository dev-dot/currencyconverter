package de.hdm_stuttgart.mi;

import com.google.gson.Gson;
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
    public static String httpCurrency = "";

    public static void url() throws IOException {

        // Setting URL
        String url_str = "https://api.exchangerate-api.com/v4/latest/" + httpCurrency;

// Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = null;
        try {
            request = (HttpURLConnection) url.openConnection();
            System.out.println("HTTP Connection: " + request.getResponseMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        request.connect();
        System.out.println("");

// Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        jsonobj = root.getAsJsonObject();


// Accessing object


    }
}