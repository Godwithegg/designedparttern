package com.danhuang.strategy;

public class OldCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�Ͽͻ��������������");
		return standarPrice*0.8;
	}
	
}
