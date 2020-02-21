package com.deesworld.practiceAPI;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseComp extends Ticker {


    private String base;
    private String target;
    private long price;
    private String volume;
    private String change;

    public BaseComp() {
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
        return "{" +
                "id=" + base +
                ", quote='" + target + '\'' + price +" "+ volume +" "+ change +
                '}';
    }
}