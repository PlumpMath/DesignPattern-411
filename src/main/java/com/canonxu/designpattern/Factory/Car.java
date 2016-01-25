package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/21.
 */



// 此处为一个接口，名字为“Car”，包括Ford、Honda等汽车，每种汽车都有获取品牌归属国家的方法
public interface Car {
    String attributeCountry();
}
