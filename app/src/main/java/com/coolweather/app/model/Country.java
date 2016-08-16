package com.coolweather.app.model;

/**
 * Created by 渠不与 on 2016/8/15 0015.
 */
public class Country {
    private int id;
    private String countryName;
    private String countryCode;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getcountryName(){
        return countryName;
    }

    public void setcountryName(String countryName){
        this.countryName=countryName;
    }

    public String getcountryCode(){
        return countryCode;
    }

    public void setcountryCode(String countryCode){
        this.countryCode=countryCode;
    }

    public int getcityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
