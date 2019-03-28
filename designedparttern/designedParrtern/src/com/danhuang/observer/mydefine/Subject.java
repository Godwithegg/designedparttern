package com.danhuang.observer.mydefine;

import java.util.ArrayList;
import java.util.List;

/**
 * �������
 * 
 * @author danhuang
 *
 */
public class Subject {

	protected List<Observer> list = new ArrayList<>(); // �۲������������й۲���

	public void registerObserver(Observer observer) {
		list.add(observer);
	}

	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	// ֪ͨ���еĹ۲��߸���״̬
	public void notifyAllObservers() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
