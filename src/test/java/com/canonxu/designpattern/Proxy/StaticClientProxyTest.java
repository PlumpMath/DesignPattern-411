package com.canonxu.designpattern.Proxy;

import org.junit.Test;

/**
 * Created by canonxu on 2016/1/24.
 */
public class StaticClientProxyTest {
    @Test
    public void staticClientProxyTest(){
        StaticClientProxy staticClientProxy = new StaticClientProxy();
        staticClientProxy.login();
    }


}
