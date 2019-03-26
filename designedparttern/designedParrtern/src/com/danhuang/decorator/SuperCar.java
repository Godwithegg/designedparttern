package com.danhuang.decorator;

/**
 * װ�ν�ɫ
 * @author danhuang
 *
 */
public class SuperCar implements ICar{
	
	private ICar car;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}
}
