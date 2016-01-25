/**
 * Created by canonxu on 2016/1/21.
 */

package com.canonxu.designpattern.Singleton;

//单例模式，通过类直接调用静态getXXX方法，单例类值产生一个实例，全局的
//应用非常广泛，如线程池、http缓存、日志对象等等
//例： apollo中多个http频繁调用同一个API，通过单例的httpClient用于保持登陆状态（token），减少冗余验证
//例：使用Log4j初始化logger时， private static Logger logger = Logger.getLogger(XXX.class)中只获取针对XXX.class的一个单例logger
//    内部实现应该为将 private Logger(String str)私有化，同一个str只会产生一个实例

//单例模式要解决两个问题：一个是“延迟加载”，另一个是“线程安全”。比较好的方案是：内部静态类。


//普通的类，用于测试时作比较
/*
public class Singleton{

}
*/

//饿汉模式（以空间换时间）
//只要Singleton类被装载了就会new出实例，调用getSingleton时直接使用
//饿汉模式天生线程安全的

public class Singleton{
    private Singleton(){}
    private static final Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }
}


//懒汉模式（以时间换空间）
//只有调用getSingleton方法时才开始new出对象，延迟加载

/*public class Singleton {
    private Singleton(){}
    private static Singleton singleton = null;
    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}*/


// 懒汉模式有线程同步的问题，即并发环境下可能出现多个Singelton实例
// 可以通过需给getXXX方法加锁来解决
//通过getXXX方法加锁可以解决多线程问题，但是每一次调用都要付出synchronized的代价，效率很低。

/*public class Singleton {
    private Singleton(){}
    private static Singleton singleton = null;
    public static synchronized Singleton getSingleton(){         //在此处加锁，防止生成多个Singleton实例
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}*/


//为了解决getXXX方法直接加锁带来的性能问题，“双重检查锁定”，double-checked-loading，来优化
//注意：原“双重检查锁定”是无效的，因为java平台编译时可能会发生的“重排序”。
// 一定要加volatile，线程调用该变量时会读取修改后最近的值（而不是线程中的缓存或重排序导致的以前的值）。
// 但是volatile开销也不小甚至与synchronized相当，所以，双重检查锁定是一种很聪明的思想，但是没有内部静态类能解决问题。

/*public class Singleton{
    private Singleton(){}
    private volatile static Singleton singleton = null;
    public static Singleton getSingleton(){
        if(singleton == null){                                //第一次检查
            synchronized (Singleton.class){
                if(singleton == null){                       //第二次检查
                    singleton = new Singleton();
                }
            }
        }
    return singleton;
    }
}*/


//通过内部静态类，达到lazy loading，而且既能解决线程安全问题，又能避免synchronized带来的性能影响。
//前提知识：类只有在new或者静态属性/方法被使用时才被加载，类Singleton中的静态内部类SingletonHolder只有在被调用到时才会被加载
//类Singleton加载时内部静态类SingletonHolder并不加载，只有在调用getXXX方法用到静态内部类时该静态内部类才加载，实现了lazy loading。

/*public  class Singleton{
    private Singleton(){}
    private static class SingletonHolder{
        public static final Singleton singleton = new Singleton();
    }
    public static final Singleton getSingleton(){
        return SingletonHolder.singleton;
    }
}*/




