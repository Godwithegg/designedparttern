package com.danhuang.factory.factorymethod;

/**
 * ��������ģʽ�����ø������д��룬�������������������ѡ�񹤳�����ģʽ����ʵ��Ӧ���У�����һ�㶼�ü򵥹���ģʽ 
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		c1.run();
		c2.run();
		
	}
}
