package com.canonxu.designpattern.Decorator;

/**
 * Created by canonxu on 2016/1/24.
 */

//����װ���࣬ProjectManagerʵ��Project�ӿڣ���Project����������������Ͻ���Decorate
public abstract class ProjectManager implements Project {
    private Project project;

    public ProjectManager(Project project) {
        this.project = project;
    }

    public void Coding() {
        project.Coding();
    }

}
