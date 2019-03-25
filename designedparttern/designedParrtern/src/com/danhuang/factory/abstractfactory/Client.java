package com.danhuang.factory.abstractfactory;

/**
 * 抽象工厂方法
 * 不可以增加产品，但是可以增加产品族
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		CarFactory carFactory = new LuxuryCarFactory();
		Engine engine = carFactory.createEngine();
		engine.run();
		engine.start();
	}
}
