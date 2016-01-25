package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */

//用于“工厂方法”生产单一产品
/*
public class HondaFactory implements CarFactory {
    public Car createCar() {
        return new HondaCar();
    }
}
*/

//用于“抽象工厂”生产产品族
public class HondaFactory implements VehicleAbstractFactory{
    public Car createCar() {
        return new HondaCar();
    }
    public Truck createTruck() {
        return new HondaTruck();
    }
}
