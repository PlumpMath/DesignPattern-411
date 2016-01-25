package com.canonxu.designpattern.Proxy;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by canonxu on 2016/1/24.
 */

//代理模式：为其它对象提供一种代理以控制对这个对象的访问

//代理模式与装饰器模式的区别：
// 代理模式拥有原对象的控制权，重点在控制原对象（静态代理编译时确定控制权，动态代理运行时确定控制权），如访问权等
//装饰器模式没有原对象的控制权，重点在装饰原对象（运行时确定装饰权）
public class StaticClientProxy implements Client{
    private PCClient client;

    public StaticClientProxy(){
        this.client = new PCClient();              //静态代理，编译时就已经确定代理的对象。通过new对象，单一代理PCClient类型。
    }

    public void login() {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);  // Calendar获取各种时刻的int值
        Date data = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dataFormat.format(data);        //Date结合SimpleDateFormat获取各种时刻组合的字符串
        if(hourOfDay <= 21 ) {                      //此处实现对象的控制，如只能在22点之前登陆
           client.login();
        } else {
            System.out.println("time is " +currentTime+", login is forbidden!");
        }
    }
}
