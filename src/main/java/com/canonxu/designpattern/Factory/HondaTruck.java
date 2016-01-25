package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */
public class HondaTruck implements Truck{
    private String country = "HondaTruck: Japan";

    public String attributeCountry() {
        return this.country;
    }
}
