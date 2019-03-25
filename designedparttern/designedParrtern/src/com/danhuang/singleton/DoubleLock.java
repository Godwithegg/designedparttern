package com.danhuang.singleton;

/**
 * ˫�ؼ����ģʽ
 * �ص㣺����JVM�ײ��ڲ�ģ��ԭ��ż��������⡣������ʹ��
 * @author danhuang
 *
 */
public class DoubleLock {
	private static DoubleLock instance = null;
	public static DoubleLock getInstance() {
		if(instance == null) {
			DoubleLock sc;
			synchronized(DoubleLock.class) {
				sc = instance;
				if(sc == null) {
					synchronized(DoubleLock.class) {
						if(sc == null) {
							sc = new DoubleLock();
						}
					}
				instance = sc;
				}
			}
		}
		return instance;
	}
}
