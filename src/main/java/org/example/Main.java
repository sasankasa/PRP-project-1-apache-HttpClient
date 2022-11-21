package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Main {

    final static CloseableHttpClient httpClient = HttpClients.createDefault();
    public static void simpleGet() throws Exception{
        HttpGet request = new HttpGet("https://api.gios.gov.pl/pjp-api/rest/station/findAll");

        CloseableHttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        //System.out.println(EntityUtils.toString(entity));

        if(response.getStatusLine().getStatusCode() != 200){
            System.out.println("Connection is bad " + response.getStatusLine().getStatusCode());
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        List<Station> stationList = new ArrayList<Station>();
        //int counter = 0;
        stationList = mapper.readValue(EntityUtils.toString(entity), new TypeReference<List<Station>>() {});

        //counter = stationList.size();
        //System.out.println(counter + " stations found");

        for (Station station : stationList) {
            System.out.println(station.toSpecificString());
            //something
        }
    }

    public static void parameterizedGet(int stationId) throws Exception{
        String URL = String.format("https://api.gios.gov.pl/pjp-api/rest/aqindex/getIndex/%d", stationId);
        
        HttpGet request = new HttpGet(URL);

        CloseableHttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        //System.out.println(EntityUtils.toString(entity));

        if(response.getStatusLine().getStatusCode() != 200){
            System.out.println("Connection is bad " + response.getStatusLine().getStatusCode());
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        SpecificStation specstation = new SpecificStation();
        specstation = mapper.readValue(EntityUtils.toString(entity), SpecificStation.class);

        System.out.println(specstation.toString());
        

    }
    public static void main(String[] args) throws Exception{
        //simpleGet();

        System.out.println("Podaj numer stacji, której pogodę chcesz zobaczyć.");

        Scanner scan = new Scanner(System.in);
        String number_str = scan.nextLine();
        int number = Integer.parseInt(number_str);
        scan.close();

        parameterizedGet(number);
    }
}