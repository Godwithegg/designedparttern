package com.danhuang.observer.javase;

import java.util.Observable;

//Ŀ�����
public class ConcreteSubject extends Observable{
	
	private int state;

	public void setState(int state) {
		this.state = state;	//Ŀ��������ı�
		setChanged();	//��ʾĿ������Ѿ����˸���
		notifyObservers(state);//֪ͨ���еĹ۲���
	}

	public int getState() {
		return state;
	}
	
}
