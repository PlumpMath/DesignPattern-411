package com.canonxu.designpattern.Proxy;

/**
 * Created by canonxu on 2016/1/24.
 */
public class PCClient implements Client {
    private String type = "PC";

    public String getType() {
        return type;
    }

    public void login() {
        System.out.println("PC login ...");
    }
}
