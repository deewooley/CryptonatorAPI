package com.deesworld.practiceAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {


    private BaseComp based;
    private String timestamp;
    private String success;
    private String error;
    private String value;


    public Ticker(String timestamp, String success, String error, String value ) {
       this.timestamp = timestamp;
       this.success = success;
       this.error = error;
       this.value = value;
    }

    public Ticker() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public BaseComp getBase() {
        return based;
    }

    public void setBaseComp(BaseComp based) {
        this.based = based;
    }


    @Override
    public String toString() {
        return "ticker: "  + " timestamp: "  +
                 timestamp+ '\"' + based+
                ", success= " + success +
                 ", error :\""+error+"\" ";
    }
}