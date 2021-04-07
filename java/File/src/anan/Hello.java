package anan;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali Sezer
 */
public class Hello {
    
      public int i = 0;
      
    public void createFile() throws IOException{
        
       for(i = 0;i<1000;i++){
        String a = "Anan" + i + ".txt";
        
        System.out.println(i);
    
        File file = new File(a);
        
        FileWriter fw = new FileWriter(file);
        
        i++;
        
        System.out.println(i);
       }
    }
    
}
