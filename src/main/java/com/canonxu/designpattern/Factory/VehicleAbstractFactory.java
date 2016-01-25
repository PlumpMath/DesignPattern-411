package com.canonxu.designpattern.Factory;

/**
 * Created by canonxu on 2016/1/22.
 */

//�ݽ���
// �򵥹���ģʽ-��һ��������һ��Interface�µĲ�Ʒ
//��������ģʽ-һ��Factory interface�¶���������������Ե�һ��Ʒ
//���󹤳�ģʽ-һ��Factory interface�¶���������������Ե���Ʒ��


//���󹤳�����Ӧ����Ʒ�塱�ĸ����Ʒ�岻�ٵ�һ����Car��ͬʱ����Trunk�ȵ�
public interface VehicleAbstractFactory {
    Car createCar();
    Truck createTruck();
}
