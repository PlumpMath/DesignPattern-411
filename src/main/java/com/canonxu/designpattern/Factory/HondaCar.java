package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */
public class HondaCar implements Car{
    private String country = "HondaCar: Japan";

    public String attributeCountry() {
        return this.country;
    }
}
