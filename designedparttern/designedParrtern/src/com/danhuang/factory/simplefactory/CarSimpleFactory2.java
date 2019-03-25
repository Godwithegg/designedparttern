package com.danhuang.factory.simplefactory;

/**
 * 简单工厂类
 * @author danhuang
 *
 */
public class CarSimpleFactory2 {
	
	public static Car createAudi() {
		return new Audi();
	}
	public static Car createByd() {
		return new Byd(); 
	}
}
