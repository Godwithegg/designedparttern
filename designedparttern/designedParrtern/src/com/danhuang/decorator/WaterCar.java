package com.danhuang.decorator;

/**
 * 具体装饰对象
 * @author danhuang
 *
 */
public class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	}
	
	public void swim() {
		System.out.println("水上游");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}
