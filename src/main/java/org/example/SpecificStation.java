package org.example;

public class SpecificStation {
    private int id;
    private String stCalcDate;
    private StIndex stIndexLevel;
    private String stSourceDataDate;
    private String so2CalcDate;
    private So2Index so2IndexLevel;
    private String so2SourceDataDate;
    private String no2CalcDate;
    private No2Index no2IndexLevel;
    private String no2SourceDataDate;
    private String pm10CalcDate;
    private Pm10Index pm10IndexLevel;
    private String pm10SourceDataDate;
    private String pm25CalcDate;
    private Pm25Index pm25IndexLevel;
    private String pm25SourceDataDate;
    private String o3CalcDate;
    private O3Index o3IndexLevel;
    private String o3SourceDataDate;
    private String stIndexStatus;
    private String stIndexCrParam;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStCalcDate() {
        return stCalcDate;
    }
    public void setStCalcDate(String stCalcDate) {
        this.stCalcDate = stCalcDate;
    }
    public StIndex getStIndexLevel() {
        return stIndexLevel;
    }
    public void setStIndexLevel(StIndex stIndexLevel) {
        this.stIndexLevel = stIndexLevel;
    }
    public String getStSourceDataDate() {
        return stSourceDataDate;
    }
    public void setStSourceDataDate(String stSourceDataDate) {
        this.stSourceDataDate = stSourceDataDate;
    }
    public String getSo2CalcDate() {
        return so2CalcDate;
    }
    public void setSo2CalcDate(String so2CalcDate) {
        this.so2CalcDate = so2CalcDate;
    }
    public So2Index getSo2IndexLevel() {
        return so2IndexLevel;
    }
    public void setSo2IndexLevel(So2Index so2IndexLevel) {
        this.so2IndexLevel = so2IndexLevel;
    }
    public String getSo2SourceDataDate() {
        return so2SourceDataDate;
    }
    public void setSo2SourceDataDate(String so2SourceDataDate) {
        this.so2SourceDataDate = so2SourceDataDate;
    }
    public String getNo2CalcDate() {
        return no2CalcDate;
    }
    public void setNo2CalcDate(String no2CalcDate) {
        this.no2CalcDate = no2CalcDate;
    }
    public No2Index getNo2IndexLevel() {
        return no2IndexLevel;
    }
    public void setNo2IndexLevel(No2Index no2IndexLevel) {
        this.no2IndexLevel = no2IndexLevel;
    }
    public String getNo2SourceDataDate() {
        return no2SourceDataDate;
    }
    public void setNo2SourceDataDate(String no2SourceDataDate) {
        this.no2SourceDataDate = no2SourceDataDate;
    }
    public String getPm10CalcDate() {
        return pm10CalcDate;
    }
    public void setPm10CalcDate(String pm10CalcDate) {
        this.pm10CalcDate = pm10CalcDate;
    }
    public Pm10Index getPm10IndexLevel() {
        return pm10IndexLevel;
    }
    public void setPm10IndexLevel(Pm10Index pm10IndexLevel) {
        this.pm10IndexLevel = pm10IndexLevel;
    }
    public String getPm10SourceDataDate() {
        return pm10SourceDataDate;
    }
    public void setPm10SourceDataDate(String pm10SourceDataDate) {
        this.pm10SourceDataDate = pm10SourceDataDate;
    }
    public String getPm25CalcDate() {
        return pm25CalcDate;
    }
    public void setPm25CalcDate(String pm25CalcDate) {
        this.pm25CalcDate = pm25CalcDate;
    }
    public Pm25Index getPm25IndexLevel() {
        return pm25IndexLevel;
    }
    public void setPm25IndexLevel(Pm25Index pm25IndexLevel) {
        this.pm25IndexLevel = pm25IndexLevel;
    }
    public String getPm25SourceDataDate() {
        return pm25SourceDataDate;
    }
    public void setPm25SourceDataDate(String pm25SourceDataDate) {
        this.pm25SourceDataDate = pm25SourceDataDate;
    }
    public String getO3CalcDate() {
        return o3CalcDate;
    }
    public void setO3CalcDate(String o3CalcDate) {
        this.o3CalcDate = o3CalcDate;
    }
    public O3Index getO3IndexLevel() {
        return o3IndexLevel;
    }
    public void setO3IndexLevel(O3Index o3IndexLevel) {
        this.o3IndexLevel = o3IndexLevel;
    }
    public String getO3SourceDataDate() {
        return o3SourceDataDate;
    }
    public void setO3SourceDataDate(String o3SourceDataDate) {
        this.o3SourceDataDate = o3SourceDataDate;
    }
    public String getStIndexStatus() {
        return stIndexStatus;
    }
    public void setStIndexStatus(String stIndexStatus) {
        this.stIndexStatus = stIndexStatus;
    }
    public String getStIndexCrParam() {
        return stIndexCrParam;
    }
    public void setStIndexCrParam(String stIndexCrParam) {
        this.stIndexCrParam = stIndexCrParam;
    }
    @Override
    public String toString() {
        return "{\n\tid : " + id + ", \n\tstCalcDate : " + stCalcDate + ", \n\tstIndexLevel : " + stIndexLevel
        + ", \n\tstSourceDataDate : " + stSourceDataDate + ", \n\tso2CalcDate : " + so2CalcDate + ", \n\tso2IndexLevel : "
        + so2IndexLevel + ", \n\tso2SourceDataDate : " + so2SourceDataDate + ", \n\tno2CalcDate : " + no2CalcDate
        + ", \n\tno2IndexLevel : " + no2IndexLevel + ", \n\tno2SourceDataDate : " + no2SourceDataDate + ", \n\tpm10CalcDate : "
        + pm10CalcDate + ", \n\tpm10IndexLevel : " + pm10IndexLevel + ", \n\tpm10SourceDataDate : " + pm10SourceDataDate
        + ", \n\tpm25CalcDate : " + pm25CalcDate + ", \n\tpm25IndexLevel : " + pm25IndexLevel + ", \n\tpm25SourceDataDate : "
        + pm25SourceDataDate + ", \n\to3CalcDate : " + o3CalcDate + ", \n\to3IndexLevel : " + o3IndexLevel
        + ", \n\to3SourceDataDate : " + o3SourceDataDate + ", \n\tstIndexStatus : " + stIndexStatus + ", \n\tstIndexCrParam : "
        + stIndexCrParam + "\n}";
    }
    
}
