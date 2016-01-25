package com.canonxu.designpattern.Proxy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by canonxu on 2016/1/24.
 */
public class DynamicClientProxy implements Client {
    private Client client;
    public DynamicClientProxy(Client client){      //动态代理和静态代理只有此处不同。
        this.client = client;                      //动态代理，运行时确定代理的对象。通过参数传入对象，代理多种Client类型
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

