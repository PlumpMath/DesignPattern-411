package com.canonxu.designpattern.Decorator;

/**
 * Created by canonxu on 2016/1/24.
 */
public class WebProjectManager extends ProjectManager {
    public WebProjectManager(Project project) {
        super(project);
    }

    @Override
    public void Coding() {
        // 装饰效果1：开启web项目
        StartProject();
        //执行装饰前工作
        super.Coding();
        // 装饰效果2：开启web项目
        ShutdownProject();

    }

    public void StartProject() {
        System.out.println("start web project!");
    }

    public void ShutdownProject() {
        System.out.println("shutdown web project!");
    }

}
