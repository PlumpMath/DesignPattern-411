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
        //web 装饰前
        webProject.Coding();
        //web装饰后
        webProjectManager.Coding();

        AppProject appProject = new AppProject();
        AppProjectManager appProjectManager = new AppProjectManager(appProject);
        //app装饰前
        appProject.Coding();
        //app装饰后
        appProjectManager.Coding();
    }
}
