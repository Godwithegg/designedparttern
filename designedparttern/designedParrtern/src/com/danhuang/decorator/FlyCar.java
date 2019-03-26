package com.danhuang.decorator;

/**
 * 具体装饰对象
 * @author danhuang
 *
 */
public class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly() {
		System.out.println("天上飞");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
}
