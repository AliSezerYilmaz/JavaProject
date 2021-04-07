/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thirdproject;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

/**
 *
 * @author kucuksille
 */
public class WeatherClient {
    private final String APPID_HEADER = "x-api-key";

    private String baseUrl = "https://api.openweathermap.org/data/2.5/weather?q=";
    private String appId = "9c49ce4bac41266145056224e0220c3e";
    private HttpClient httpClient;
    
    public WeatherClient(){
        httpClient = HttpClientBuilder.create().build();
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    public JSONObject getWeather(String city) throws IOException{
        String queryString = String.format("%s&APPID=%s&units=metric", city, appId);
        HttpGet httpGet = new HttpGet(baseUrl + queryString);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        
        InputStream inputStream = httpResponse.getEntity().getContent();
        StringWriter stringWriter = new StringWriter();
        IOUtils.copy(inputStream, stringWriter, "Utf-8");
        inputStream.close();
        
        return new JSONObject(stringWriter.toString());
               
    }
}
