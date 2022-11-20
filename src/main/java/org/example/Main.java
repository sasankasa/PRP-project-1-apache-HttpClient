package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

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
        int counter = 0;
        stationList = mapper.readValue(EntityUtils.toString(entity), new TypeReference<List<Station>>() {});

        counter = stationList.size();
        System.out.println(counter + " stations found");

    }
    public static void main(String[] args) throws Exception{
        simpleGet();
    }
}