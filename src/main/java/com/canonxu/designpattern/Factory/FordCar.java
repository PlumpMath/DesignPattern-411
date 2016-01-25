package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */
public class FordCar implements Car{
    private String country = "FordCar: America";

    public String attributeCountry() {
        return this.country;
    }
}
