package com.danhuang.observer.mydefine;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象
 * 
 * @author danhuang
 *
 */
public class Subject {

	protected List<Observer> list = new ArrayList<>(); // 观察主题对象的所有观察者

	public void registerObserver(Observer observer) {
		list.add(observer);
	}

	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	// 通知所有的观察者更新状态
	public void notifyAllObservers() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
