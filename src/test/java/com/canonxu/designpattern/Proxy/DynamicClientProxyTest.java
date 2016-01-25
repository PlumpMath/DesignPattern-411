package com.canonxu.designpattern.Proxy;

import org.junit.Test;

/**
 * Created by canonxu on 2016/1/24.
 */
public class DynamicClientProxyTest {
    @Test
    public void dynamicClientProxyTest(){
        Client client1 = new TabletClient();   //��������new�����ͣ����Դ���������͵�Client
        Client client2 = new PCClient();   //��������new�����ͣ����Դ���������͵�Client

        DynamicClientProxy dynamicClientProxy1 = new DynamicClientProxy(client1);
        dynamicClientProxy1.login();
        DynamicClientProxy dynamicClientProxy2 = new DynamicClientProxy(client2);
        dynamicClientProxy2.login();
    }
}
