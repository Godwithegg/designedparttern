package com.danhuang.factory.simplefactory;

/**
 * 简单工厂模式，缺点是需要增加新产品的时候要更改已有的代码，不符合开闭原则
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Car car = (Car) new CarSimpleFactory1().createCar("奥迪");
		car.run();
	}
}
