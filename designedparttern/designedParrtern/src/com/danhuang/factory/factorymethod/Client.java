package com.danhuang.factory.factorymethod;

/**
 * 工厂方法模式，不用更改已有代码，根据设计理论我们优先选择工厂方法模式，但实际应用中，我们一般都用简单工厂模式 
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		c1.run();
		c2.run();
		
	}
}
