package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */
/*
//���ڡ�����������������һ��Ʒ
public class FordFactory implements CarFactory {
    public Car createCar() {
        return new FordCar();
    }
}
*/

//���ڡ����󹤳�������������Ʒ��
public class FordFactory implements VehicleAbstractFactory {
    public Car createCar() {
        return new FordCar();
    }
    public Truck createTruck() {
        return new FordTruck();
    }
}
