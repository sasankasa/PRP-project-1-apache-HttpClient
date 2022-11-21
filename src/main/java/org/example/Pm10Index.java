package org.example;

public class Pm10Index {
    private int id;
    private String indexLevelName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIndexLevelName() {
        return indexLevelName;
    }
    public void setIndexLevelName(String indexLevelName) {
        this.indexLevelName = indexLevelName;
    }
    @Override
    public String toString() {
        return "Pm10Index {id = " + id + ", indexLevelName = " + indexLevelName + "}";
    }
     
}
