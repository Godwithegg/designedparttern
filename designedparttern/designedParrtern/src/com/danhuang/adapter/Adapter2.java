package com.danhuang.adapter;

/**
 * ������������ʽ��ʹ�������
 * 
 * @author danhuang
 *
 */
public class Adapter2 implements Target {

	private Adaptee adaptee;

	@Override
	public void handleRequest() {
		System.out.print("����������:");
		adaptee.request();
	}

	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}
