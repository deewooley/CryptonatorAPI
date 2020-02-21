package com.deesworld.practiceAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {


    private BaseComp baseComp;
    private String timestamp;
    private String success;
    private String error;
    private String value;
    private String target;


    public Ticker(String timestamp, String success, String error, String value, String target) {
       this.timestamp = timestamp;
       this.success = success;
       this.error = error;
       this.value = value;
       this.target = target;
    }

    public Ticker() {
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
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
        return baseComp;
    }

    public void setBaseComp(BaseComp based) {
        this.baseComp = based;
    }


    @Override
    public String toString() {
        return "ticker: "  + " timestamp: "  +
                 timestamp+ '\"' + baseComp+target+
                ", success= " + success +
                 ", error :\""+error+"\" ";
    }
}