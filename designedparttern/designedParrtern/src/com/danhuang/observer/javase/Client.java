package com.danhuang.observer.javase;

import com.danhuang.observer.mydefine.Subject;

/**
 * �۲���ģʽ��javase�Դ��ģ�
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		//����Ŀ�����
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		//�����۲���
		ObserverA observerA1 = new ObserverA();
		ObserverA observerA2 = new ObserverA();
		ObserverA observerA3 = new ObserverA();
		
		//���۲��߶�����ӵ�Ŀ�������
		concreteSubject.addObserver(observerA1);
		concreteSubject.addObserver(observerA2);
		concreteSubject.addObserver(observerA3);
		
		//�ı�subject�����״̬
		concreteSubject.setState(100);
		
		//�۲�۲���ģʽ�����ı仯
		System.out.println(observerA1.getMyState());
		System.out.println(observerA2.getMyState());
		System.out.println(observerA3.getMyState());
		
	}
}
