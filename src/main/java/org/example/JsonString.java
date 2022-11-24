package org.example;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class JsonString {

    public String JsonStringGetter(String word) throws Exception{
        String result = "none";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("https://api.gios.gov.pl/pjp-api/rest/station/findAll");

        CloseableHttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().toString());
        
        HttpEntity entity = response.getEntity();

        Header headers = entity.getContentType();
        System.out.println(headers);


        if (entity != null) {
            result = EntityUtils.toString(entity);
            System.out.println(result);
        }
        System.out.println(entity.toString());
        return result + word;
    }
}
