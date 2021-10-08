package ru.startandroid.develop.testhtc.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {
    public static String getResponseFromURL(URL url) throws IOException{

        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        BufferedReader jr = new BufferedReader(new InputStreamReader((InputStream) request.getContent()));
        StringBuilder sb= new StringBuilder();
        while(jr.ready()){
            sb.append(jr.readLine());

        }
        return sb.toString();
    }
}
