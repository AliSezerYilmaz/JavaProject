
package com.asy.mavenproject2;

import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;


public class JsoupCenter {
    String Test;
    String Tanı;
    String Vefat;
    String Iyi;

    public String getTest() {  try {
            org.jsoup.nodes.Document doc = Jsoup.connect("https://api.collectapi.com/corona/Turkey").get();
           
            String test= doc.select("authorization.7KNtD3edjDhYHZAPSthNqc:5ulWdOSvgmToAnJphmWSbx").text();
 
          
        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public String getTanı() {
        return Tanı;
    }

    public void setTanı(String Tanı) {
        this.Tanı = Tanı;
    }

    public String getVefat() {
        return Vefat;
    }

    public void setVefat(String Vefat) {
        this.Vefat = Vefat;
    }

    public String getIyi() {
        return Iyi;
    }

    public void setIyi(String Iyi) {
        this.Iyi = Iyi;
    }
    
}
