package com.danhuang.adapter;

/**
 * ������ģʽ
 * @author danhuang
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Client c = new Client();
		Target t = new Adapter();
		t.handleRequest();
		
		Adaptee a = new Adaptee();
		Target t2 = new Adapter2(a);
		t2.handleRequest();
	}
}
