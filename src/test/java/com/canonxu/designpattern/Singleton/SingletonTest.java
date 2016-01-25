/**
 * Created by canonxu on 2016/1/21.
 */

package com.canonxu.designpattern.Singleton;

import com.canonxu.designpattern.Singleton.Singleton;
import org.junit.Test;

public class SingletonTest {
    @Test  //alt+shift+f10
    public void singletonTest(){
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.hashCode());              //result:30940873
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());             //result:30940873
    }

/*    @Test
    public void commonClassTest(){
        Singleton commomClass1 = new Singleton();
        System.out.println(commomClass1.hashCode());  //result:24431393
        Singleton commomClass2 = new Singleton();
        System.out.println(commomClass2.hashCode());  //result:12839271
    }*/
}
