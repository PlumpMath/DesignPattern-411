package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */

//工厂方法模式
//工厂方法模式是对简单工厂模式的抽象和推广，简单工厂模式将产品抽象成接口，工厂方法模式进一步将Factory也抽象成接口
// 优点：1.不再依赖于单一具体工厂类，而是实现工厂接口，可以实现多个工厂类。
//       2.扩展容易，增加产品时需要增加产品类和该产品类的工厂（而不是修改那个单一具体的工厂），符合开闭原则。

public interface CarFactory {
    Car createCar();
}
