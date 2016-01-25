package com.canonxu.designpattern.Decorator;

/**
 * Created by canonxu on 2016/1/24.
 */

//抽象装饰类，ProjectManager实现Project接口，将Project包裹进来在其基础上进行Decorate
public abstract class ProjectManager implements Project {
    private Project project;

    public ProjectManager(Project project) {
        this.project = project;
    }

    public void Coding() {
        project.Coding();
    }

}
