package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */
public class FordTruck implements Truck{
    private String country = "FordTruck: America";

    public String attributeCountry() {
        return this.country;
    }
}
