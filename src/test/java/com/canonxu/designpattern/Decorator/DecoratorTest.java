package com.canonxu.designpattern.Decorator;

import com.sun.imageio.plugins.wbmp.WBMPImageReader;
import org.junit.Test;

/**
 * Created by canonxu on 2016/1/24.
 */
public class DecoratorTest {

    @Test
    public void decoratorTest() {
        WebProject webProject = new WebProject();
        WebProjectManager webProjectManager = new WebProjectManager(webProject);
        //web װ��ǰ
        webProject.Coding();
        //webװ�κ�
        webProjectManager.Coding();

        AppProject appProject = new AppProject();
        AppProjectManager appProjectManager = new AppProjectManager(appProject);
        //appװ��ǰ
        appProject.Coding();
        //appװ�κ�
        appProjectManager.Coding();
    }
}
