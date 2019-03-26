package com.danhuang.decorator;

/**
 * ����װ�ζ���
 * @author danhuang
 *
 */
public class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	
	public void autoMove() {
		System.out.println("�Զ���");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
}
