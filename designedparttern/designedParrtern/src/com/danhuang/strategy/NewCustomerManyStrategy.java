package com.danhuang.strategy;

public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("��ͨ�û��������������");
		return standarPrice*0.9;
	}
	
}
