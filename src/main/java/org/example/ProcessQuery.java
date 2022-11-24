package org.example;

public class ProcessQuery {

    JsonString queryClass;

    public ProcessQuery(JsonString queryClass) {
        this.queryClass = queryClass;
    }

    public String process(String word) throws Exception {
        return queryClass.JsonStringGetter(word).toUpperCase();
    }

}
