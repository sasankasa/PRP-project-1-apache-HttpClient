package org.example;

public class Station {
    private int id;
    private String stationName;
    private String gegrLat;
    private String gegrLon;
    private City city;
    private String addressStreet;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getGegrLat() {
        return gegrLat;
    }

    public void setGegrLat(String gegrLat) {
        this.gegrLat = gegrLat;
    }

    public String getGegrLon() {
        return gegrLon;
    }

    public void setGegrLon(String gegrLon) {
        this.gegrLon = gegrLon;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    
    @Override
    public String toString() {
        return "Station {id=" + id + ", stationName=" + stationName + ", gegrLat=" + gegrLat + ", gegrLon=" + gegrLon
                + ", city=" + city + ", addressStreet=" + addressStreet + "}";
    }

    public String toSpecificString() {
        return "Station {id = " + id + ", stationName = " + stationName + "}";
    }

}
