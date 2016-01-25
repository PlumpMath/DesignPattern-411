package com.canonxu.designpattern.Factory;

import org.junit.Test;

/**
 * Created by canonxu on 2016/1/22.
 */
public class AbstractFactoryTest {
    @Test
    public void abstractFactoryTest(){
        FordFactory fordFactory = new FordFactory();
        Car car1 = fordFactory.createCar();
        Truck truck1 = fordFactory.createTruck();
        HondaFactory hondaFactory = new HondaFactory();
        Car car2 = hondaFactory.createCar();
        Truck truck2 =hondaFactory.createTruck();
        System.out.println(car1.attributeCountry() + "  "  + car2.attributeCountry());
        System.out.println(truck1.attributeCountry() + "  " + truck2.attributeCountry());
    }
}
