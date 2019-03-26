package com.danhuang.decorator;

/**
 * 装饰器模式
 * 应用：IO流就是一个典型的装饰器模式
 * 模型：				  (抽象构件角色)
 * 			(具体构建角色)			(装饰角色)
 * 						(具体装饰角色1,具体装饰角色2,具体装饰角色3)
 * 特点：
 *  装饰模式（Decorator）也叫包装器模式（Wrapper）
 *  	 – 装饰模式降低系统的耦合度，可以动态的增加或删除对象的职责，并 使得需要装饰的具体构建类和具体装饰类可以独立变化，以便增加新 的具体构建类和具体装饰类。 
 *  • 优点 – 扩展对象功能，比继承灵活，不会导致类个数急剧增加
 *  	 – 可以对一个对象进行多次装饰，创造出不同行为的组合，得到功能更 加强大的对象 
 *  	 – 具体构建类和具体装饰类可以独立变化，用户可以根据需要自己增加 新的具体构件子类和具体装饰子类。 
 *  • 缺点 – 产生很多小对象。大量小对象占据内存，一定程度上影响性能。 – 装饰模式易于出错，调试排查比较麻烦。
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.move();
		
		System.out.println("--------增加新的功能，飞行----------");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("----------飞行基础上增加新的功能，水上游-----------");
		WaterCar waterCar = new WaterCar(flyCar);
		waterCar.move();
		
		System.out.println("----------终极形态--------------");
		AICar aiCar = new AICar(waterCar);
		aiCar.move();
	}
}
