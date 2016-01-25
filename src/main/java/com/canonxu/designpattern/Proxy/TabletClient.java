package com.canonxu.designpattern.Proxy;

/**
 * Created by canonxu on 2016/1/24.
 */
public class TabletClient implements Client {
    private String type = "Tablet";

    public String getType() {
        return type;
    }

    public void login() {
        System.out.println("Tablet login...");
    }
    public void visit() {
        System.out.println("Tablet visit...");
    }
}
