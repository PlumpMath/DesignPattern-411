package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */

//简单工厂模式（静态工厂模式）
// 优点：单一的工厂用于创建产品，通过Interface Car管理产品，向客户隐藏了产品实例化的细节，客户只需向工厂“消费”产品而无需关心产品实例化的细节
//缺点：1.所有的产品实例化逻辑都集中在CarSimpleFactory类中，一旦该类不能工作，整个系统都会受影响
//      2.系统扩展困难，增加产品时不仅需要新建产品类，还需要修改CarSimpleFactory类，不易扩展
//      3.使用了静态方法，无法形成基于继承的等级结构

//静态属性/方法是属于类的属性/方法，没有严格意义上的“继承”这么一说，不能实现多态（重写/重载）！
//如果子类中没有定义同名静态属性/方法，子类仍可直接通过“子类名.静态属性/方法”调用，子类调用的其实是父类的属性/方法，没有继承到自身上来，不是严格的“继承”。
//如果子类中定义了同名静态属性/方法，此时为“隐藏”，而不是“重写”，“重写”意味着子类的优先级高于父类的优先级，而“隐藏”没有优先级之分。
//如果子类中值定义了同名的静态属性而没有定义同名的静态方法，在调用“子类名.静态方法”时，用的都是父类的属性/方法。

public class CarSimpleFactory {

    //非静态，使用时需要new CatFactory这个工厂。相比静态调用，每次都需要建造新工厂，开销大。
/*
    public Car createCar(String band){
        if("FordCar".equals(band)){
            return new FordCar();
        }
        if("HondaCar".equals(band)){
            return new HondaCar();
        }else {
            return null;
        }
    }
*/

    //静态，即将创建方法静态，无需new该CarFactory即可使用
    // 此处需输入String类型参数，易错
/*
    public static Car createCar(String band){
        if("FordCar".equals(band)){
            return new FordCar();
        }
        if("HondaCar".equals(band)){
            return new HondaCar();
        }else {
            return null;
        }
    }
*/



    public static Car createCarFord(){
        return new FordCar();
    }
    public static Car createCarHonda(){
        return new HondaCar();
    }


}
