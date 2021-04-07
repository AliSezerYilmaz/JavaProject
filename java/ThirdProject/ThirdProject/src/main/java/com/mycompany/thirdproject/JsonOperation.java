/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thirdproject;

import org.json.JSONObject;

/**
 *
 * @author kucuksille
 */
public class JsonOperation {
    private JSONObject myJson;
    
    
    public JsonOperation(JSONObject myJson){
        this.myJson = myJson;
        
    }
    
    public Object getKeyValue(String key){
        return myJson.get(key);
    } 
    
    public Object getKeyValue(String keyFirst, String keyTwo){
        return myJson.getJSONObject(keyFirst).get(keyTwo);
    }
    
    public Object getKeyValue(String keyFirst, int index, String keyTwo){
        return myJson.getJSONArray(keyFirst).getJSONObject(index).get(keyTwo);
    }
    
   
}
