package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */

//�򵥹���ģʽ����̬����ģʽ��
// �ŵ㣺��һ�Ĺ������ڴ�����Ʒ��ͨ��Interface Car�����Ʒ����ͻ������˲�Ʒʵ������ϸ�ڣ��ͻ�ֻ���򹤳������ѡ���Ʒ��������Ĳ�Ʒʵ������ϸ��
//ȱ�㣺1.���еĲ�Ʒʵ�����߼���������CarSimpleFactory���У�һ�����಻�ܹ���������ϵͳ������Ӱ��
//      2.ϵͳ��չ���ѣ����Ӳ�Ʒʱ������Ҫ�½���Ʒ�࣬����Ҫ�޸�CarSimpleFactory�࣬������չ
//      3.ʹ���˾�̬�������޷��γɻ��ڼ̳еĵȼ��ṹ

//��̬����/�����������������/������û���ϸ������ϵġ��̳С���ôһ˵������ʵ�ֶ�̬����д/���أ���
//���������û�ж���ͬ����̬����/�����������Կ�ֱ��ͨ����������.��̬����/���������ã�������õ���ʵ�Ǹ��������/������û�м̳е����������������ϸ�ġ��̳С���
//��������ж�����ͬ����̬����/��������ʱΪ�����ء��������ǡ���д��������д����ζ����������ȼ����ڸ�������ȼ����������ء�û�����ȼ�֮�֡�
//���������ֵ������ͬ���ľ�̬���Զ�û�ж���ͬ���ľ�̬�������ڵ��á�������.��̬������ʱ���õĶ��Ǹ��������/������

public class CarSimpleFactory {

    //�Ǿ�̬��ʹ��ʱ��Ҫnew CatFactory�����������Ⱦ�̬���ã�ÿ�ζ���Ҫ�����¹�����������
/*
    public Car createCar(String band){
        if("FordCar".equals(band)){
            return new FordCar();
        }
        if("HondaCar".equals(band)){
            return new HondaCar();
        }else {
            return null;
        }
    }
*/

    //��̬����������������̬������new��CarFactory����ʹ��
    // �˴�������String���Ͳ������״�
/*
    public static Car createCar(String band){
        if("FordCar".equals(band)){
            return new FordCar();
        }
        if("HondaCar".equals(band)){
            return new HondaCar();
        }else {
            return null;
        }
    }
*/



    public static Car createCarFord(){
        return new FordCar();
    }
    public static Car createCarHonda(){
        return new HondaCar();
    }


}
