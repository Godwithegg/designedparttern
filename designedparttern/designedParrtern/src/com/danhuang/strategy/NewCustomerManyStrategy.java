package com.danhuang.strategy;

public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("普通用户大批量，打九折");
		return standarPrice*0.9;
	}
	
}
