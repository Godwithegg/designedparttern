package com.danhuang.decorator;

/**
 * 具体装饰对象
 * @author danhuang
 *
 */
public class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	
	public void autoMove() {
		System.out.println("自动跑");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
}
