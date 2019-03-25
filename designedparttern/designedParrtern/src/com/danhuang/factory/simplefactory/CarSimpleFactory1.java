package com.danhuang.factory.simplefactory;

/**
 * 简单工厂类
 * @author danhuang
 *
 */
public class CarSimpleFactory1 {
	public static Car createCar(String type) {
		if("奥迪".equals(type)) {
			return new Audi();
		}else if("比亚迪".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
	}
}
