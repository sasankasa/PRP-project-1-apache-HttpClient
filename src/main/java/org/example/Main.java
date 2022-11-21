package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

import com.itextpdf.text.*;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Main {

    final static CloseableHttpClient httpClient = HttpClients.createDefault();
    public static void allStationsId() throws Exception{
        HttpGet request = new HttpGet("https://api.gios.gov.pl/pjp-api/rest/station/findAll");

        CloseableHttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();

        if(response.getStatusLine().getStatusCode() != 200){
            System.out.println("Bad connetion " + response.getStatusLine().getStatusCode());
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        List<Station> stationList = new ArrayList<Station>();
        stationList = mapper.readValue(EntityUtils.toString(entity), new TypeReference<List<Station>>() {});

        int i = 0;
        for (Station station : stationList) {
            i ++;
            System.out.println(i + " " + station.toSpecificString());
        }
        
    }

    public static void createPdf(String index, String station) throws FileNotFoundException, DocumentException{
        String file_path = index + ".pdf";
 
        // creating PdfWriter object
        PdfWriter pdf_writer = new PdfWriter(file_path);
 
        // Representing PdfDocument object
        PdfDocument pdf_doc = new PdfDocument(pdf_writer);
 
        // Creating a Document
        // Instantiating a document object from pdf document
        // object
        Document document = new Document(pdf_doc);
 
        // paragraph to be added
        String para = station;
 
              // Creating Paragraph object
        Paragraph paragraph_obj = new Paragraph(para);
 
        // Adding paragraphs to document
        document.add(paragraph_obj);
       
        // Closing the document
        document.close();
       
        // final message
        System.out.println("Finished writing contents to the file!");
    }

    /*public static String scanId(){
        
        Scanner scan = new Scanner(System.in);
        String stationIdString = scan.nextLine();
        return stationIdString;
    }*/
    public static void parameterizedGet() throws Exception{

        //String stationIdString = scanId();

        Scanner scan = new Scanner(System.in);
        String stationIdString = scan.nextLine();

        int stationId = Integer.parseInt(stationIdString);

        String URL = String.format("https://api.gios.gov.pl/pjp-api/rest/aqindex/getIndex/%d", stationId);
        
        HttpGet request = new HttpGet(URL);

        CloseableHttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();

        if(response.getStatusLine().getStatusCode() != 200){
            System.out.println("Bad connection " + response.getStatusLine().getStatusCode());
            scan.close();
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        SpecificStation specstation = new SpecificStation();
        specstation = mapper.readValue(EntityUtils.toString(entity), SpecificStation.class);

        if (specstation.getNo2CalcDate() == null ) {
            System.out.println("Brak stacji o takim ID. Podaj ponownie ID ze stacji podanych wyżej: ");
            parameterizedGet();
        } else {
            System.out.println(specstation.toString());
            createPdf(stationIdString, specstation.toString());
            
        }
        
        scan.close();

    }
    public static void main(String[] args) throws Exception{

        allStationsId();

        System.out.println("Podaj numer ID stacji, której pogodę chcesz zobaczyć: ");

        parameterizedGet();
        
    }
}