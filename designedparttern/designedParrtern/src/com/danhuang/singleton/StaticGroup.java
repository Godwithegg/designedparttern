package com.danhuang.singleton;

/**
 * ��̬��Ա����ģʽ
 * �ص㣺�̰߳�ȫ������Ч�ʸߡ� ���ǣ�������ʱ����
 * @author danhuang
 *
 */
public class StaticGroup {
	private static class StaticInstance{
		private static StaticGroup instance = new StaticGroup();
	}
	private StaticGroup(){}
	public static StaticGroup getInstance() {
		return StaticInstance.instance;
	}
	
	
}
