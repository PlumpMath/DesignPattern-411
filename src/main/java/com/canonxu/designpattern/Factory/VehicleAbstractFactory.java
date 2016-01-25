package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */

//演进：
// 简单工厂模式-单一工厂生产一个Interface下的产品
//工厂方法模式-一个Factory interface下多个工厂，生产各自单一产品
//抽象工厂模式-一个Factory interface下多个工厂，生产各自单产品族


//抽象工厂，对应“产品族”的概念，产品族不再单一生产Car，同时生产Trunk等等
public interface VehicleAbstractFactory {
    Car createCar();
    Truck createTruck();
}
