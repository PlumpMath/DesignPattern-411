/**
 * Created by canonxu on 2016/1/21.
 */

package com.canonxu.designpattern.Singleton;

//����ģʽ��ͨ����ֱ�ӵ��þ�̬getXXX������������ֵ����һ��ʵ����ȫ�ֵ�
//Ӧ�÷ǳ��㷺�����̳߳ء�http���桢��־����ȵ�
//���� apollo�ж��httpƵ������ͬһ��API��ͨ��������httpClient���ڱ��ֵ�½״̬��token��������������֤
//����ʹ��Log4j��ʼ��loggerʱ�� private static Logger logger = Logger.getLogger(XXX.class)��ֻ��ȡ���XXX.class��һ������logger
//    �ڲ�ʵ��Ӧ��Ϊ�� private Logger(String str)˽�л���ͬһ��strֻ�����һ��ʵ��

//����ģʽҪ����������⣺һ���ǡ��ӳټ��ء�����һ���ǡ��̰߳�ȫ�����ȽϺõķ����ǣ��ڲ���̬�ࡣ


//��ͨ���࣬���ڲ���ʱ���Ƚ�
/*
public class Singleton{

}
*/

//����ģʽ���Կռ任ʱ�䣩
//ֻҪSingleton�౻װ���˾ͻ�new��ʵ��������getSingletonʱֱ��ʹ��
//����ģʽ�����̰߳�ȫ��

public class Singleton{
    private Singleton(){}
    private static final Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }
}


//����ģʽ����ʱ�任�ռ䣩
//ֻ�е���getSingleton����ʱ�ſ�ʼnew�������ӳټ���

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


// ����ģʽ���߳�ͬ�������⣬�����������¿��ܳ��ֶ��Singeltonʵ��
// ����ͨ�����getXXX�������������
//ͨ��getXXX�����������Խ�����߳����⣬����ÿһ�ε��ö�Ҫ����synchronized�Ĵ��ۣ�Ч�ʺܵ͡�

/*public class Singleton {
    private Singleton(){}
    private static Singleton singleton = null;
    public static synchronized Singleton getSingleton(){         //�ڴ˴���������ֹ���ɶ��Singletonʵ��
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}*/


//Ϊ�˽��getXXX����ֱ�Ӽ����������������⣬��˫�ؼ����������double-checked-loading�����Ż�
//ע�⣺ԭ��˫�ؼ������������Ч�ģ���Ϊjavaƽ̨����ʱ���ܻᷢ���ġ������򡱡�
// һ��Ҫ��volatile���̵߳��øñ���ʱ���ȡ�޸ĺ������ֵ���������߳��еĻ�����������µ���ǰ��ֵ����
// ����volatile����Ҳ��С������synchronized�൱�����ԣ�˫�ؼ��������һ�ֺܴ�����˼�룬����û���ڲ���̬���ܽ�����⡣

/*public class Singleton{
    private Singleton(){}
    private volatile static Singleton singleton = null;
    public static Singleton getSingleton(){
        if(singleton == null){                                //��һ�μ��
            synchronized (Singleton.class){
                if(singleton == null){                       //�ڶ��μ��
                    singleton = new Singleton();
                }
            }
        }
    return singleton;
    }
}*/


//ͨ���ڲ���̬�࣬�ﵽlazy loading�����Ҽ��ܽ���̰߳�ȫ���⣬���ܱ���synchronized����������Ӱ�졣
//ǰ��֪ʶ����ֻ����new���߾�̬����/������ʹ��ʱ�ű����أ���Singleton�еľ�̬�ڲ���SingletonHolderֻ���ڱ����õ�ʱ�Żᱻ����
//��Singleton����ʱ�ڲ���̬��SingletonHolder�������أ�ֻ���ڵ���getXXX�����õ���̬�ڲ���ʱ�þ�̬�ڲ���ż��أ�ʵ����lazy loading��

/*public  class Singleton{
    private Singleton(){}
    private static class SingletonHolder{
        public static final Singleton singleton = new Singleton();
    }
    public static final Singleton getSingleton(){
        return SingletonHolder.singleton;
    }
}*/




