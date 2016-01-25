package com.canonxu.designpattern.Factory;

import org.junit.Test;

/**
 * Created by canonxu on 2016/1/22.
 */
public class FactoryMethodTest {
    @Test
    public void factoryMethodTest(){
        FordFactory fordFactory = new FordFactory();
        Car car1 = fordFactory.createCar();
        HondaFactory hondaFactory = new HondaFactory();
        Car car2 = hondaFactory.createCar();
        System.out.println(car1.attributeCountry() + "  "  + car2.attributeCountry());
    }
}
