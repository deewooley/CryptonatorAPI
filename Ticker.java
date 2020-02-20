package com.deesworld.practiceAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {



    private String timestamp;
    private String success;
    private String error;
    private String value;
    private String base;
    private String target;
    private long price;
    private String volume;
    private String change;
//ISSUE WITH GETTERS AND SETTERS
    Base based = new Base();


//value
    public Ticker() {
        
    }


    public String getBase() {
        return this.base;
    }
    public void setBase(String base) {
        this.base= base;
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


    public String getTarget() {
        return this.target;
    }
    public void setTarget(String target) {
        this.target= target;
    }

    public long getPrice() {
        return this.price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    public String getVolume() {
        return this.volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getChange() {
        return this.change;
    }
    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public String toString() {



        return "ticker: "  + based+" timestamp: "  +
                 timestamp+ '\"' +
                ", success= " + success +
                 ", error :\""+error+"\" ";
    }
}