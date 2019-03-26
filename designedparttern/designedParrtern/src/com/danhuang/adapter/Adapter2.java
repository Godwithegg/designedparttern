package com.danhuang.adapter;

/**
 * 对象适配器方式，使用了组合
 * 
 * @author danhuang
 *
 */
public class Adapter2 implements Target {

	private Adaptee adaptee;

	@Override
	public void handleRequest() {
		System.out.print("适配器处理:");
		adaptee.request();
	}

	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}
