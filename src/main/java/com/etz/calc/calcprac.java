package com.etz.calc;


import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafiat.aminu
 */
@Stateless
@Path("calc")
public class calcprac {
    
    @Path("add")
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String add(String jsonString){
        JSONObject enlarge = new JSONObject(jsonString);
        String firstNumber = StringUtils.defaultIfBlank((String) enlarge.get("val"), "");
        String secondNumber = StringUtils.defaultIfBlank((String) enlarge.get("val2"), "");
         
        int intfirstNum = Integer.parseInt("firstNumber");
        int intsecNum = Integer.parseInt("secondNumber");
        int sum; 
        sum = intfirstNum + intsecNum;
        return "The sum of " + firstNumber + "and" + secondNumber + "is " +sum;
        
    }
    
    @Path("subtract")
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String subtract(String jsonString){
        JSONObject enlarge = new JSONObject(jsonString);
        String firstNumber = StringUtils.defaultIfBlank((String) enlarge.get("vals"), "");
        String secondNumber = StringUtils.defaultIfBlank((String) enlarge.get("vals2"), "");
         
        int intfirstNum = Integer.parseInt("firstNumber");
        int intsecNum = Integer.parseInt("secondNumber");
        int sub; 
        sub = intsecNum - intfirstNum;
        return "is " + sub +"The difference of " + firstNumber + "and" + secondNumber;
        
    }  
    
    @Path("multiply")
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
     public String multiply(String jsonString){
        JSONObject enlarge = new JSONObject(jsonString);
        String firstNumber = StringUtils.defaultIfBlank((String) enlarge.get("valm"), "");
        String secondNumber = StringUtils.defaultIfBlank((String) enlarge.get("valm2"), "");
         
        int intfirstNum = Integer.parseInt("firstNumber");
        int intsecNum = Integer.parseInt("secondNumber");
        int mult; 
        mult = intsecNum * intfirstNum;
        return "is " + mult +"The multiplication of " + firstNumber + "and" + secondNumber;
          
}
     
    @Path("divide")
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String divide(String jsonString){
        JSONObject enlarge = new JSONObject(jsonString);
        String firstNumber = StringUtils.defaultIfBlank((String) enlarge.get("vald"), "");
        String secondNumber = StringUtils.defaultIfBlank((String) enlarge.get("vald2"), "");
         
        int intfirstNum = Integer.parseInt("firstNumber");
        int intsecNum = Integer.parseInt("secondNumber");
        int div; 
        div = intsecNum / intfirstNum;
        return "is " + div +"The division of " + firstNumber + "and" + secondNumber;
          
}
}
