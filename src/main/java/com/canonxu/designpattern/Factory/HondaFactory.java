package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */

//���ڡ�����������������һ��Ʒ
/*
public class HondaFactory implements CarFactory {
    public Car createCar() {
        return new HondaCar();
    }
}
*/

//���ڡ����󹤳���������Ʒ��
public class HondaFactory implements VehicleAbstractFactory{
    public Car createCar() {
        return new HondaCar();
    }
    public Truck createTruck() {
        return new HondaTruck();
    }
}
