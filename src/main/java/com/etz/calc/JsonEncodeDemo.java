/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.calc;

import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
/**
 *
 * @author rafiat.aminu
 */


class JsonEncodeDemo {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", 100);
      obj.put("balance", 1000.21);
      obj.put("is_vip", true);
      
      obj.put("name","foo");
      obj.put("num", 100);
      obj.put("balance", 1000.21);
      obj.put("is_vip", true);

      StringWriter out = new StringWriter(); 
       try {
           obj.writeJSONString(out);
       } catch (IOException ex) {
           Logger.getLogger(JsonEncodeDemo.class.getName()).log(Level.SEVERE, null, ex);
       }
      
      String jsonText = out.toString();
      System.out.print(jsonText);

      System.out.print(obj);
   }
   
    
}