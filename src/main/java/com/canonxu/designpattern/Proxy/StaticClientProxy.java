package com.canonxu.designpattern.Proxy;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by canonxu on 2016/1/24.
 */

//����ģʽ��Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ���

//����ģʽ��װ����ģʽ������
// ����ģʽӵ��ԭ����Ŀ���Ȩ���ص��ڿ���ԭ���󣨾�̬�������ʱȷ������Ȩ����̬��������ʱȷ������Ȩ���������Ȩ��
//װ����ģʽû��ԭ����Ŀ���Ȩ���ص���װ��ԭ��������ʱȷ��װ��Ȩ��
public class StaticClientProxy implements Client{
    private PCClient client;

    public StaticClientProxy(){
        this.client = new PCClient();              //��̬��������ʱ���Ѿ�ȷ������Ķ���ͨ��new���󣬵�һ����PCClient���͡�
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
