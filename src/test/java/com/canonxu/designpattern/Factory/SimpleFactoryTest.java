package com.canonxu.designpattern.Factory;

import org.junit.Test;

/**
 * Created by canonxu on 2016/1/22.
 */



public class SimpleFactoryTest {

/*
    @Test
    public void factoryTest(){
        CarSimpleFactory carFactory = new CarSimpleFactory();
        Car car1 = carFactory.createCar("FordCar");
        Car car2 = carFactory.createCar("HondaCar");
        System.out.println(car1.attributeCountry()+"  " +car2.attributeCountry());
    }

    @Test
    public void staticFactoryTest(){
        Car car1 = CarSimpleFactory.createCar("FordCar");
        Car car2 = CarSimpleFactory.createCar("HondaCar");
        System.out.println(car1.attributeCountry() + "  " + car2.attributeCountry());
    }
*/

    @Test
    public void ststicFactoryWithoutStringTest(){
        Car car1 = CarSimpleFactory.createCarFord();
        Car car2 = CarSimpleFactory.createCarHonda();
        System.out.println(car1.attributeCountry() + "  " + car2.attributeCountry());
    }

}
