package com.danhuang.strategy;

public class OldCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�Ͽͻ�С�������������");
		return standarPrice*0.85;
	}
	
}
