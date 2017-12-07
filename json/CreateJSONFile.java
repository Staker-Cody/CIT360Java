package com.company.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJSONFile {

    public static void main(String[] args){

        JSONObject obj = new JSONObject();
        obj.put("name", "Cody Staker");
        obj.put("location","USA");


        JSONArray list = new JSONArray();
        list.add("Java");
        list.add("JSP");
        list.add("Servlets");

        obj.put("courses", list);

        try (FileWriter file = new FileWriter("jsonStuff.json")) {
            file.write(obj.toString());
            file.flush();
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
