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
        // װ��Ч��1������web��Ŀ
        StartProject();
        //ִ��װ��ǰ����
        super.Coding();
        // װ��Ч��2������web��Ŀ
        ShutdownProject();

    }

    public void StartProject() {
        System.out.println("start web project!");
    }

    public void ShutdownProject() {
        System.out.println("shutdown web project!");
    }

}
