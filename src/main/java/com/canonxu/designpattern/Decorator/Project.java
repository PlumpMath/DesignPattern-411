package com.canonxu.designpattern.Decorator;

/**
 * Created by canonxu on 2016/1/24.
 */

//装饰器模式：动态地给一个对象添加一些额外的职责（仅能额外装饰，不能改变原有对象行为，没有对象的控制权）
//最理所当然是用子类继承来增加新功能，但是装饰器模式更灵活

//构造器模式的根源在于这个Project接口，各种Project类实现此接口，ProjectManager抽象类也实现该接口
//ProjectManager抽象类用来装饰各种Project，ProjectManager构造器中传入Project作为参数将其包裹进来
//各种ProjectManager类继承ProjectManager抽象类，进行装饰
public interface Project {
    void Coding();
}
