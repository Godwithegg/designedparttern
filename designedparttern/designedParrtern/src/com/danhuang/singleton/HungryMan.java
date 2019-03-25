package com.danhuang.singleton;


/**
 * ����ģʽ
 * �ص㣺���̰߳�ȫ������Ч�ʸߡ� ���ǣ�������ʱ���ء���
 * @author danhuang
 *
 */
public class HungryMan {
	private static final HungryMan instance = new HungryMan();
	public static HungryMan getInstance() {
		return instance;
	}
	private HungryMan(){}
	
}
