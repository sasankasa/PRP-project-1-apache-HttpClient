package org.example;

public class StationPrint {
    int id;
    String city;
   
    public StationPrint(int id, String city) {
        this.id = id;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Station { id = " + id + ", city = " + city + "}";
    }

    
}
