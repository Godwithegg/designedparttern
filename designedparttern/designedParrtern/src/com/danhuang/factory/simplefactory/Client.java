package com.danhuang.factory.simplefactory;

/**
 * �򵥹���ģʽ��ȱ������Ҫ�����²�Ʒ��ʱ��Ҫ�������еĴ��룬�����Ͽ���ԭ��
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Car car = (Car) new CarSimpleFactory1().createCar("�µ�");
		car.run();
	}
}
