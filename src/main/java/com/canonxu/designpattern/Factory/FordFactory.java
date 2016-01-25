package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */
/*
//用于“工厂方法”生产单一产品
public class FordFactory implements CarFactory {
    public Car createCar() {
        return new FordCar();
    }
}
*/

//用于“抽象工厂方法”生产产品线
public class FordFactory implements VehicleAbstractFactory {
    public Car createCar() {
        return new FordCar();
    }
    public Truck createTruck() {
        return new FordTruck();
    }
}
