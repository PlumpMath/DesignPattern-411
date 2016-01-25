package com.canonxu.designpattern.Decorator;

/**
 * Created by canonxu on 2016/1/24.
 */
public class AppProjectManager extends ProjectManager {
    public AppProjectManager(Project project){
        super(project);
    }

    @Override
    public void Coding() {
        StartProject();
        super.Coding();
        ShutdownProject();
    }

    public void StartProject() {
        System.out.println("start app project!");
    }

    public void ShutdownProject() {
        System.out.println("shutdown app project!");
    }
}
