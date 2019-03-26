package com.danhuang.adapter;

/**
 * 适配器模式
 *  – 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原 本由于接口不兼容而不能一起工作的那些类可以在一起工作。 • 模式中的角色 
 *  – 目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象 的类，也可以是接口。 
 *  – 需要适配的类（Adaptee）：需要适配的类或适配者类。 
 *  – 适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成 目标接口。　
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
