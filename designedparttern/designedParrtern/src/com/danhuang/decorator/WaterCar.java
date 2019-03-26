package com.danhuang.decorator;

/**
 * ����װ�ζ���
 * @author danhuang
 *
 */
public class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	}
	
	public void swim() {
		System.out.println("ˮ����");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}
