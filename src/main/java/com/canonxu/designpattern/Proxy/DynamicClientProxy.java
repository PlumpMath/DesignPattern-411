package com.canonxu.designpattern.Proxy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by canonxu on 2016/1/24.
 */
public class DynamicClientProxy implements Client {
    private Client client;
    public DynamicClientProxy(Client client){      //��̬����;�̬����ֻ�д˴���ͬ��
        this.client = client;                      //��̬��������ʱȷ������Ķ���ͨ������������󣬴������Client����
    }

    public void login() {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);  // Calendar��ȡ����ʱ�̵�intֵ
        Date data = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dataFormat.format(data);        //Date���SimpleDateFormat��ȡ����ʱ����ϵ��ַ���
        if(hourOfDay <= 21 ) {                      //�˴�ʵ�ֶ���Ŀ��ƣ���ֻ����22��֮ǰ��½
            client.login();
        } else {
            System.out.println("time is " +currentTime+", login is forbidden!");
        }
    }
    }

