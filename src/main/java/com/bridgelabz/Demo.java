package com.bridgelabz;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args)throws IOException, ParseException {
    	
    	Stock stockList =new Stock("shri", 123);
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("C:\\Users\\shrishail\\Desktop\\LFP-182\\MavenProject\\src\\main\\java\\sample.txt"));
        
        System.out.println(jsonObject);        
        System.out.println(stockList);
   
   }
}
