package org.example;

public class StIndex {
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
        return "StIndex {id = " + id + ", indexLevelName = " + indexLevelName + "}";
    }
        
}
