package com.sabi.assessment.api.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class IntegrationTest {

	public void getVideoList () {
		
        try {

        	String pageNumber = "2";
            String url = "http://localhost/rental/videolist/" + pageNumber;            
            String USER_AGENT = "Mozilla/5.0";
	            
            try (CloseableHttpClient client = HttpClients.createDefault()) {
            	
                HttpGet request = new HttpGet(url);
                
                // add request header
                request.addHeader("User-Agent", USER_AGENT);
                
                HttpResponse response = client.execute(request);
                
                BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                StringBuilder result = new StringBuilder();
                
                String line = "";
                
                while ((line = rd.readLine()) != null) {
                    
                    result.append(line);
                    
                }                
                
                System.out.println("\nSending 'GET' request to URL : " + url);
                System.out.println(result.toString());
                
                
                client.close();                   
                                               
            }
                                                                                               
            
        } catch (IOException | UnsupportedOperationException ex) {

            System.out.println("Could not retrieve transaction properties " + ex.getMessage());
            
        }		
		  	    	
    }


	public void getPrice () {
		
        try {

        	String videoId = "4"; 
        	String numberOfDays = "7";
            String url = "http://localhost/rental/price/" + videoId + "/" + numberOfDays;            
            String USER_AGENT = "Mozilla/5.0";
	            
            try (CloseableHttpClient client = HttpClients.createDefault()) {
            	
                HttpGet request = new HttpGet(url);
                
                // add request header
                request.addHeader("User-Agent", USER_AGENT);
                
                HttpResponse response = client.execute(request);
                
                BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                StringBuilder result = new StringBuilder();
                
                String line = "";
                
                while ((line = rd.readLine()) != null) {
                    
                    result.append(line);
                    
                }                
                
                System.out.println("\nSending 'GET' request to URL : " + url);
                System.out.println(result.toString());
                
                
                client.close();                   
                                               
            }
                                                                                               
            
        } catch (IOException | UnsupportedOperationException ex) {

            System.out.println("Could not retrieve transaction properties " + ex.getMessage());
            
        }		
			    	
    }    
	
}
