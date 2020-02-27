package com.deesworld.practiceAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Crypto {


    private Ticker ticker;
    private String timestamp;
    private String success;
    private String error;


    public Crypto() {
    }

    public Crypto(Ticker ticker, String timestamp, String success, String error) {
        this.ticker = ticker;
        this.timestamp = timestamp;
        this.success = success;
        this.error = error;
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

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker based) {
        this.ticker = based;
    }

    @Override
    public String toString() {
        return "Crypto{" +
                "ticker=" + ticker +
                ", timestamp='" + timestamp + '\'' +
                ", success='" + success + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}