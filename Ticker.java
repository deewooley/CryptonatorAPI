package com.deesworld.practiceAPI;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {


    private String base;
    private String target;
    private String price;
    private String volume;
    private String change;

//    public Ticker() {
//    }

    public Ticker(String base, String target, String price, String volume, String change) {
        this.base = base;
        this.target = target;
        this.price = price;
        this.volume = volume;
        this.change = change;
    }

    public String getBase() {
        return this.base;
    }
    public void setBase(String base) {
        this.base= base;
    }

    public String getTarget() {
        return this.target;
    }
    public void setTarget(String target) {
        this.target= target;
    }

    public String getPrice() {
        return this.price;
    }
    public void setPrice(String price) {
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
        return "Ticker{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", price=" + price +
                ", volume='" + volume + '\'' +
                ", change='" + change + '\'' +
                '}';
    }
}