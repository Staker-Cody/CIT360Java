package com.company.HttpURLConnection;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connect {



    public static void main(String[] args)  {
        StringBuilder webContent = new StringBuilder();
        try {


            URL url = new URL("https://staker-cody.github.io/CIT260/");

            HttpURLConnection web = (HttpURLConnection)url.openConnection();
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(web.getInputStream()));
            String line;

            while((line = bufferedreader.readLine())!= null){
                webContent.append(line + "\n");

            }
            bufferedreader.close();
            web.disconnect();



        }catch(Exception e ){

            System.out.println(e);
        }
        System.out.println(webContent);
    }


}
