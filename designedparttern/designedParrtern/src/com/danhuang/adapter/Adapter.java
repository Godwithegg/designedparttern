package com.danhuang.adapter;

/**
 * ������
 * @author danhuang
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleRequest() {
		System.out.print("����������:");
		super.request();
	}

}
