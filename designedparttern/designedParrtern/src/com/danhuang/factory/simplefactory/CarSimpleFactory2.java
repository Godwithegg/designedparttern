package com.danhuang.factory.simplefactory;

/**
 * �򵥹�����
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
