package com.danhuang.factory.abstractfactory;

/**
 * �ݳ��Ƶķ�����
 * @author danhuang
 *
 */
public class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("�ܵÿ�");
	}

	@Override
	public void start() {
		System.out.println("�����죡");
	}
	
}
