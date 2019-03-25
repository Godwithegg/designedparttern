package com.danhuang.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ����ģʽ
 * �ص㣺�̰߳�ȫ������Ч�ʲ��ߡ� ���ǣ�������ʱ���ء�
 * Ϊ�˷�ֹ�����л��ͷ��䣬���˹���������Ͷ�����readResolve����
 * @author danhuang
 *
 */
public class LazyMan implements Serializable{
	private static LazyMan instance = null;
	public static synchronized LazyMan getInstance() throws Exception {
		if(instance == null) {
			instance = new LazyMan();
		}
		return instance;
	}
	
	private LazyMan() throws Exception{
		if(instance != null) {
			throw new Exception("�Ѿ�ʵ������");
		}
	}
	//�����л�ʱ��������������ඨ����readResolve()����ʵ����һ�ֻص��������巵���ĸ�����
	public Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
