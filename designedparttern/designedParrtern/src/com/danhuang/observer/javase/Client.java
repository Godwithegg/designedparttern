package com.danhuang.observer.javase;

import com.danhuang.observer.mydefine.Subject;

/**
 * 观察者模式（javase自带的）
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		//创建目标对象
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		//创建观察者
		ObserverA observerA1 = new ObserverA();
		ObserverA observerA2 = new ObserverA();
		ObserverA observerA3 = new ObserverA();
		
		//将观察者对象添加到目标对象中
		concreteSubject.addObserver(observerA1);
		concreteSubject.addObserver(observerA2);
		concreteSubject.addObserver(observerA3);
		
		//改变subject对象的状态
		concreteSubject.setState(100);
		
		//观察观察者模式发生的变化
		System.out.println(observerA1.getMyState());
		System.out.println(observerA2.getMyState());
		System.out.println(observerA3.getMyState());
		
	}
}
