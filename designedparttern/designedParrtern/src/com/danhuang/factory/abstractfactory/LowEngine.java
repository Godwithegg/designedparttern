package com.danhuang.factory.abstractfactory;

/**
 * �Ͷ˵ķ�����
 * @author danhuang
 *
 */
public class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("�ܵ���");
	}

	@Override
	public void start() {
		System.out.println("��������");
	}
	
}
