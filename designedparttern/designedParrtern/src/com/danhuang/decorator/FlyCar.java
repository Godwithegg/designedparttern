package com.danhuang.decorator;

/**
 * ����װ�ζ���
 * @author danhuang
 *
 */
public class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly() {
		System.out.println("���Ϸ�");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
}
